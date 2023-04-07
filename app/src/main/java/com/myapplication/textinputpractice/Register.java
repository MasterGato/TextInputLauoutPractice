package com.myapplication.textinputpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputLayout;

public class Register extends AppCompatActivity {
    private TextInputLayout firstName;
    private TextInputLayout lastName;
    private TextInputLayout middleName;
    private TextInputLayout birthDate;
    private TextInputLayout userName;
    private TextInputLayout password;
    private TextInputLayout confirmPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstName = findViewById(R.id.register_firstname);
        lastName = findViewById(R.id.register_lastname);
        middleName = findViewById(R.id.register_middlename);
        birthDate = findViewById(R.id.register_birthdate);
        userName = findViewById(R.id.register_username);
        password = findViewById(R.id.register_password);
        confirmPassword = findViewById(R.id.register_confirmpassword);

    }
}