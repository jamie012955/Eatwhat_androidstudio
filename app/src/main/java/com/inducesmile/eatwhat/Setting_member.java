package com.inducesmile.eatwhat;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Setting_member extends AppCompatActivity {

    ImageButton anImagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_member);

        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setTitle(R.string.my_tb_setting_member_title);
       /* getSupportActionBar().setSubtitle(R.string.my_tb_subtitle);*/

        // Get a support ActionBar corresponding to this toolbar //up buttom
        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        anImagebutton = (ImageButton) findViewById(R.id.ibEat);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Setting_member.this, Homepage.class));
            }
        });

        anImagebutton = (ImageButton) findViewById(R.id.ibSetting);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Setting_member.this, Setting.class));
            }
        });
    }


}
