package com.example.e_libary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;


public class Login extends AppCompatActivity {

   private TextInputEditText editTextUsername, editTextPassword;

    Button buttonLogin;
    private TextView forgetPasswordChange;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextUsername = findViewById(R.id.StuID);
        editTextPassword = findViewById(R.id.PWord);
        buttonLogin = findViewById(R.id.buttonLogin);
        forgetPasswordChange = findViewById(R.id.forgetPasswordClick);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email,password;
                email = String.valueOf(editTextUsername.getText());
                password = String.valueOf(editTextUsername.getText());
                if(TextUtils.isEmpty(email))
                {


                }


            }
        });

        forgetPasswordChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Verifiying.class);
                startActivity(intent);
            }
        });
    }
}
