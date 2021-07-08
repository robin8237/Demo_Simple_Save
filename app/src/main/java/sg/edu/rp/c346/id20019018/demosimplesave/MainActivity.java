package sg.edu.rp.c346.id20019018.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences prefs = getPreferences(MODE_PRIVATE);

        String msg = prefs.getString("Greetings", "No greetings name");
        Toast toast = Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences prefs = getPreferences(MODE_PRIVATE);

        SharedPreferences.Editor prefEdit = prefs.edit();

        prefEdit.putString("Greetings","Hello!");

        prefEdit.commit();
    }
}