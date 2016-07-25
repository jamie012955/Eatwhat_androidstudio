package com.inducesmile.eatwhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
