package dk.easj.anbo.loginpreferenceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String username = intent.getStringExtra(LoginActivity.USERNAME);
        TextView welcomeView = findViewById(R.id.main_welcome_textview);
        welcomeView.setText("Welcome " + username);
    }
}
