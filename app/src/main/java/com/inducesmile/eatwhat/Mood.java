package com.inducesmile.eatwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class Mood extends AppCompatActivity {

    ImageButton anImagebutton;
    ImageButton ibmoodselection1;
    ImageButton ibmoodselection2;
    ImageButton ibmoodselection3;
    ImageButton ibmoodselection4;
    ImageButton ibmoodselection5;
    ImageButton ibmoodselection6;
    ImageButton ibmoodselection7;
    ImageButton ibmoodselection8;


    private ImageView ib_mood_selection0_big;
    private ImageView ib_mood_selection1_big;
    private ImageView ib_mood_selection2_big;
    private ImageView ib_mood_selection3_big;
    private ImageView ib_mood_selection4_big;
    private ImageView ib_mood_selection5_big;
    private ImageView ib_mood_selection6_big;
    private ImageView ib_mood_selection7_big;
    private ImageView ib_mood_selection8_big;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);

        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setTitle(R.string.my_tb_mood_title);
       /* getSupportActionBar().setSubtitle(R.string.my_tb_subtitle);*/
        getSupportActionBar().setIcon(R.drawable.ictoolbar);

        anImagebutton = (ImageButton) findViewById(R.id.ibNext);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mood.this, Budget.class));
            }
        });
        anImagebutton = (ImageButton) findViewById(R.id.ibEat);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mood.this, Homepage.class));
            }
        });
        anImagebutton = (ImageButton) findViewById(R.id.ibSetting);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mood.this, Setting.class));
            }
        });

        ibmoodselection1 = (ImageButton) findViewById(R.id.ibmoodselection1);
        ibmoodselection2 = (ImageButton) findViewById(R.id.ibmoodselection2);
        ibmoodselection3 = (ImageButton) findViewById(R.id.ibmoodselection3);
        ibmoodselection4 = (ImageButton) findViewById(R.id.ibmoodselection4);
        ibmoodselection5 = (ImageButton) findViewById(R.id.ibmoodselection5);
        ibmoodselection6 = (ImageButton) findViewById(R.id.ibmoodselection6);
        ibmoodselection7 = (ImageButton) findViewById(R.id.ibmoodselection7);
        ibmoodselection8 = (ImageButton) findViewById(R.id.ibmoodselection8);

        ib_mood_selection0_big=  (ImageView) findViewById(R.id.ib_mood_selection0_big);
        ib_mood_selection1_big=  (ImageView) findViewById(R.id.ib_mood_selection1_big);
        ib_mood_selection2_big=  (ImageView) findViewById(R.id.ib_mood_selection2_big);
        ib_mood_selection3_big=  (ImageView) findViewById(R.id.ib_mood_selection3_big);
        ib_mood_selection4_big=  (ImageView) findViewById(R.id.ib_mood_selection4_big);
        ib_mood_selection5_big=  (ImageView) findViewById(R.id.ib_mood_selection5_big);
        ib_mood_selection6_big=  (ImageView) findViewById(R.id.ib_mood_selection6_big);
        ib_mood_selection7_big=  (ImageView) findViewById(R.id.ib_mood_selection7_big);
        ib_mood_selection8_big=  (ImageView) findViewById(R.id.ib_mood_selection8_big);
    }

    public void OnMaButtonClick(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        ib_mood_selection0_big.startAnimation(anim);
        ib_mood_selection2_big.startAnimation(anim);
        ib_mood_selection3_big.startAnimation(anim);
        ib_mood_selection4_big.startAnimation(anim);
        ib_mood_selection5_big.startAnimation(anim);
        ib_mood_selection6_big.startAnimation(anim);
        ib_mood_selection7_big.startAnimation(anim);
        ib_mood_selection8_big.startAnimation(anim);

    }
    public void OnMbButtonClick(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        ib_mood_selection0_big.startAnimation(anim);
        ib_mood_selection1_big.startAnimation(anim);
        ib_mood_selection3_big.startAnimation(anim);
        ib_mood_selection4_big.startAnimation(anim);
        ib_mood_selection5_big.startAnimation(anim);
        ib_mood_selection6_big.startAnimation(anim);
        ib_mood_selection7_big.startAnimation(anim);
        ib_mood_selection8_big.startAnimation(anim);

    }
    public void OnMcButtonClick(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        ib_mood_selection0_big.startAnimation(anim);
        ib_mood_selection1_big.startAnimation(anim);
        ib_mood_selection2_big.startAnimation(anim);
        ib_mood_selection4_big.startAnimation(anim);
        ib_mood_selection5_big.startAnimation(anim);
        ib_mood_selection6_big.startAnimation(anim);
        ib_mood_selection7_big.startAnimation(anim);
        ib_mood_selection8_big.startAnimation(anim);

    }
}
