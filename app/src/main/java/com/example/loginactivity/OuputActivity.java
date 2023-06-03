package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OuputActivity extends AppCompatActivity implements View.OnClickListener{
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ouput);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2) ;
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.equals(button1)){
            Intent it2=new Intent(this,MainActivity.class);
            startActivity(it2);
        } else {
            Intent it3=new Intent(this,LoginActivity.class);
            startActivity(it3);
        }
    }
}