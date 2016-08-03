package com.inducesmile.eatwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Budget extends AppCompatActivity {
    ImageButton anImagebutton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);


        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setTitle(R.string.my_tb_budget_title);
       /* getSupportActionBar().setSubtitle(R.string.my_tb_subtitle);*/
        getSupportActionBar().setIcon(R.drawable.ictoolbar);


        anImagebutton = (ImageButton) findViewById(R.id.ibStart);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Budget.this, Selector.class));
            }
        });
        anImagebutton = (ImageButton) findViewById(R.id.bChange);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Budget.this, Mood.class));
            }
        });
        anImagebutton = (ImageButton) findViewById(R.id.ibEat);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Budget.this, Homepage.class));
            }
        });
<<<<<<< HEAD
        anImagebutton = (ImageButton) findViewById(R.id.ibSetting);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Budget.this, Setting.class));
            }
        });
=======
>>>>>>> origin/master
    }
}
