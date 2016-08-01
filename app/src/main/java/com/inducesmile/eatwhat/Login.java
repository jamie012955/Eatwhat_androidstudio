package com.inducesmile.eatwhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import com.kosalgeek.genasync12.AsyncResponse;
import com.kosalgeek.genasync12.PostResponseAsyncTask;
import java.util.HashMap;

public class Login extends AppCompatActivity implements View.OnClickListener {
    final String LOG= "Login";

    EditText tfaccount,tfpass;
    ImageButton anImagebutton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tfaccount=(EditText) findViewById(R.id.tfaccount);
        tfpass=(EditText) findViewById(R.id.tfpass);
        anImagebutton = (ImageButton) findViewById(R.id.ibAgain);
        anImagebutton.setOnClickListener(this);
    }
    @Override
    public void onClick(View sender) {
        //startActivity(new Intent(Login.this, Homepage.class));
        //async
        HashMap postData = new HashMap();
        postData.put("uname", tfaccount.getText().toString().trim());
        postData.put("password", tfpass.getText().toString().trim() );

        PostResponseAsyncTask task = new PostResponseAsyncTask(Login.this, postData, new AsyncResponse() {
            @Override
            public void processFinish(String result) {
                Log.d(LOG,result);
                if(result.contains("success")){
                    Toast.makeText(Login.this, "Successfully Login", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(Login.this, Homepage.class));
                }
                else{
                    Toast.makeText(Login.this, "Try Again", Toast.LENGTH_LONG).show();
                }
            }
        });
        //task.execute("http://10.0.2.2/login.php");
        task.execute("http://140.127.218.199/login.php");
    }
}