package com.inducesmile.eatwhat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by yolearn on 2016/7/26.
 */
public class Registered_login extends AppCompatActivity implements View.OnClickListener {
    private static final String REGISTER_URL = "http://140.127.218.199/adduser.php";

    public static  String KEY_USERNAME = "uname";
    public static  String KEY_PASSWORD = "password";
    public static  String KEY_EMAIL = "email";

    EditText taccount;
    EditText tpass;
    EditText temail;

    ImageButton anImagebutton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered_login);

        taccount = (EditText) findViewById(R.id.taccount);
        tpass = (EditText) findViewById(R.id.tpass);
        temail = (EditText) findViewById(R.id.temail);

        anImagebutton = (ImageButton) findViewById(R.id.ibRegisterlogin);

        anImagebutton.setOnClickListener(this);
    }

    private void registerUser(){
        final String uname= taccount.getText().toString().trim();
        final String password= tpass.getText().toString().trim();
        final String email= temail.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(Registered_login.this,response,Toast.LENGTH_LONG).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Registered_login.this,error.toString(),Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put(KEY_USERNAME,uname);
                params.put(KEY_PASSWORD,password);
                params.put(KEY_EMAIL, email);
                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    public void onClick(View v) {
        if(v==anImagebutton){
            registerUser();
        }
    }


}

