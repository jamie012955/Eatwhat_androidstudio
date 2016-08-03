package com.inducesmile.eatwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {

    ImageButton anImagebutton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        anImagebutton = (ImageButton) findViewById(R.id.start);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, Mood.class));
            }
        });

        anImagebutton = (ImageButton) findViewById(R.id.ibEat);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, Homepage.class));
            }
        });
        anImagebutton = (ImageButton) findViewById(R.id.ibSetting);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this, Setting.class));
            }
        });
    }
}
