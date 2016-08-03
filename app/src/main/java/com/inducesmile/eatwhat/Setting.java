package com.inducesmile.eatwhat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.Toast;


public class Setting extends AppCompatActivity {

    ImageButton anImagebutton;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);


        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setTitle(R.string.my_tb_setting_title);
       /* getSupportActionBar().setSubtitle(R.string.my_tb_subtitle);*/

        anImagebutton = (ImageButton) findViewById(R.id.ibEat);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Setting.this, Homepage.class));
            }
        });

        anImagebutton = (ImageButton) findViewById(R.id.ibSetting);
        anImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Setting.this, Setting.class));
            }
        });

       /*以下是更改信箱的彈跳視窗
        Button setting_change_mail = (Button)findViewById(R.id.setting_change_mail);
        setting_change_mail.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(Setting.this);
                dialog.setTitle("更改信箱");
                dialog.setContentView(R.layout.activity_setting_mail);
                dialog.show();

                final EditText editText =(EditText)dialog.findViewById(R.id.setting_mail_new);
                Button submitButton = (Button)dialog.findViewById(R.id.setting_mail_yes);
                Button cancelButton = (Button)dialog.findViewById(R.id.setting_mail_no);

                submitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String text =editText.getText().toString();
                        Toast.makeText(getApplicationContext(),"信箱已更改為 :  "+text,Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                cancelButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
            }
        });
        //以上是更改信箱的彈跳視窗*/
        //以下是登出的彈跳視窗
        Button setting_logout = (Button)findViewById(R.id.setting_logout);
        setting_logout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(Setting.this);
                dialog.setTitle("登出");
                dialog.setContentView(R.layout.activity_setting_logout);
                dialog.show();

                Button logout_okButton = (Button)dialog.findViewById(R.id.setting_logout_yes);
                Button logout_noButton = (Button)dialog.findViewById(R.id.setting_logout_no);

                logout_okButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"登出成功",Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                logout_noButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
            }
        });
        //以上是登出的彈跳視窗




    }
    public void go_change_pwd(View view) {
        startActivity(new Intent(this, Setting_member.class));
    }


}

