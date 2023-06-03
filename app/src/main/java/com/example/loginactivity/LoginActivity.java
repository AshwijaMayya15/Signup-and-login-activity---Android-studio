package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener
{

    EditText txt_login_username,txt_login_password;
    Button btn_login_signin;
    String user,pass;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt_login_username=(EditText) findViewById(R.id.txt_login_username);
        txt_login_password=(EditText) findViewById(R.id.txt_login_password);
        btn_login_signin=(Button) findViewById(R.id.btn_login_signin);
        btn_login_signin.setOnClickListener(this);
        Bundle bundle=getIntent().getBundleExtra("data");
        user= bundle.getString("user");
        pass=bundle.getString("Lab@2022");

    }
    public void onClick(View v){
        String user1=txt_login_username.getText().toString();
        String pass1=txt_login_password.getText().toString();
        if(user.equals(user1) && pass.equals(pass1)) {
            Toast.makeText(this,"Login Successful", Toast.LENGTH_LONG).show();
            Intent it1=new Intent(this,OuputActivity.class);
            startActivity(it1);
        } else {
                Toast.makeText(this,"Login Failed" + count,Toast.LENGTH_LONG).show();
            }
        }
    }
