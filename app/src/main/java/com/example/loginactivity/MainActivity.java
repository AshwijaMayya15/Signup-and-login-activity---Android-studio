package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText txt_username;
    EditText txt_password;
    Button btn_signup;
    String regexpression = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!])[A-Za-z\\d@$!]{8,}$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_username=(EditText) findViewById(R.id.txt_username);
        txt_password=(EditText) findViewById(R.id.txt_password);
        btn_signup=(Button) findViewById(R.id.btn_signup);
        btn_signup.setOnClickListener(this);

    }
    public void onClick(View v) {
        String username=txt_username.getText().toString();
        String password=txt_password.getText().toString();
        if(validatePassword(password)){
            Bundle bundle=new Bundle();
            bundle.putString("user",username);
            bundle.putString("Lab@2022",password);
            Intent it=new Intent(this,LoginActivity.class);
            it.putExtra("data",bundle);
            startActivity(it);
        } else {
            Toast.makeText(getBaseContext(),"Invalid password", Toast.LENGTH_LONG).show();
        }
    }
    public boolean validatePassword(String password) {
        Pattern p=Pattern.compile(regexpression);
        Matcher m= p.matcher(password);
        return m.matches();
    }
}
