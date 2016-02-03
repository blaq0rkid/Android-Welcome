package com.example.kelley.welcomewindow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText editText_YourName;

    Button button_ClickHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_YourName = (EditText) findViewById(R.id.editText_YourName);

        button_ClickHere = (Button) findViewById(R.id.button_ClickHere);

        button_ClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, WelcomeScreen.class);
                i.putExtra("text", editText_YourName.getText().toString());
                startActivity(i);
            }
        });
    }
}