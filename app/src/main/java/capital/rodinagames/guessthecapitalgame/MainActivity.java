package capital.rodinagames.guessthecapitalgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GuessCity (View view) {
        Intent intent = new Intent(this, GuessCapitalActivity.class);
        startActivity(intent);
    }

    public void GuessCountry (View view) {
        Intent intent = new Intent(this, GuessCountryActivity.class);
        startActivity(intent);
    }

}
