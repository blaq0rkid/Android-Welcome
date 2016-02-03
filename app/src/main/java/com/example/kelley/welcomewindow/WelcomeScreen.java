package com.example.kelley.welcomewindow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class WelcomeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        TextView entered_text = (TextView) findViewById(R.id.entered_text);
        Intent i = getIntent();
        String text = "Welcome" + i.getStringExtra("text").toUpperCase() + "!";
        entered_text.setText(text);

    }
}