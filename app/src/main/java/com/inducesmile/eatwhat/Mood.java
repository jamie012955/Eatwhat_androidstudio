package com.inducesmile.eatwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.support.v7.widget.Toolbar;

public class Mood extends AppCompatActivity {

    ImageButton anImagebutton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);

        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);

        getSupportActionBar().setTitle(R.string.my_tb_title);
       /* getSupportActionBar().setSubtitle(R.string.my_tb_subtitle);*/
        getSupportActionBar().setIcon(R.drawable.ictoolbar);

        anImagebutton = (ImageButton) findViewById(R.id.ibNext);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mood.this, Budget.class));
            }
        });
    }
}
