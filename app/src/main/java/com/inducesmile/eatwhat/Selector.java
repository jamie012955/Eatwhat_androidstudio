package com.inducesmile.eatwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;



public class Selector extends AppCompatActivity {

    ImageButton anImagebutton;

    private ImageView wheel;
    private ImageView imageView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setTitle(R.string.my_tb_selector_title);
       /* getSupportActionBar().setSubtitle(R.string.my_tb_subtitle);*/
        getSupportActionBar().setIcon(R.drawable.ictoolbar);

        anImagebutton = (ImageButton) findViewById(R.id.ibEat);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Selector.this, Homepage.class));
            }
        });
        anImagebutton = (ImageButton) findViewById(R.id.back);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Selector.this, Budget.class));
            }
        });


        wheel = (ImageView) findViewById(R.id.wheel);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void OnRotateButtonClick(View v) {
        Animation anima = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        wheel.startAnimation(anima);
        imageView.startAnimation(anim);
    }
}
