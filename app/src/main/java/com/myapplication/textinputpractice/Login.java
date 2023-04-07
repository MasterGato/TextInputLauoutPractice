package com.myapplication.textinputpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    private TextInputLayout username;
    private TextInputLayout password;
    private TextView signup;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.login_username);
        password = findViewById(R.id.login_password);
        login = findViewById(R.id.login_login);
        signup = findViewById(R.id.login_signup);

        signup.setOnClickListener(input -> {
            Intent intent = new Intent(Login.this,Register.class);
            startActivity(intent);
        });

        login.setOnClickListener(e ->{
            Intent intent = new Intent();
        });


    }
}