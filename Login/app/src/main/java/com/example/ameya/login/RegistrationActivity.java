package com.example.ameya.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    private EditText firstname,lastname,email,username,password,cpassword;
    private Button regButton;
    private TextView alert1,login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        setupUIViews();


        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert1.setVisibility(View.INVISIBLE);
                if(validate()){
                    //Upload to the DATABASE
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
            }
        });

    }

    private void setupUIViews(){
        firstname = (EditText) findViewById(R.id.etFirstName);
        lastname = (EditText) findViewById(R.id.etLastName);
        email = (EditText) findViewById(R.id.etEmail);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPAssword);
        cpassword = (EditText) findViewById(R.id.etCPassword);
        regButton = (Button) findViewById(R.id.btnSignup);
        alert1 = findViewById(R.id.tvAlert1);
        login = findViewById(R.id.tvLogin);
    }
    private Boolean validate(){
        Boolean result = false;
        if((firstname.getText().toString().isEmpty()) || (email.getText().toString().isEmpty()) || (username.getText().toString().isEmpty()) || (password.getText().toString().isEmpty()) || (cpassword.getText().toString().isEmpty())){
            alert1.setVisibility(View.VISIBLE);
            alert1.setText("Please Enter all the details:");
        }
        else {
            if (password.getText().toString().equals(cpassword.getText().toString())) {
                result = true;
            } else {
                alert1.setVisibility(View.VISIBLE);
                alert1.setText("Both the passwords not matching");

            }
        }
        return  result;
    }
}


