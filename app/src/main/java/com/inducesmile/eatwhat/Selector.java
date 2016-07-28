package com.inducesmile.eatwhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Selector extends AppCompatActivity {

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
