package com.example.ameya.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickLogin(View view){
        EditText etusername = (EditText) findViewById(R.id.etUserName);
        EditText etpassword = (EditText) findViewById(R.id.etPAssword);
        Button btnlogin = (Button) findViewById(R.id.btnLogin);
        TextView alert = findViewById(R.id.tvAlert);


        if((etusername.getText().toString().isEmpty()) && (etpassword.getText().toString().isEmpty())){
            alert.setText("Please enter the Username and Password");
            alert.setVisibility(View.VISIBLE);
        }
        if(etusername.getText().toString().isEmpty() && !etpassword.getText().toString().isEmpty()){
            alert.setText("Please enter the Username");
            alert.setVisibility(View.VISIBLE);
        }
        if(etpassword.getText().toString().isEmpty() && !etusername.getText().toString().isEmpty()){
            alert.setText("Please enter the Password");
            alert.setVisibility(View.VISIBLE);
        }
        if(!etusername.getText().toString().isEmpty() && !etpassword.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this,"Login",Toast.LENGTH_SHORT).show();
        }

        Log.i("Username",etusername.getText().toString());
        Log.i("Password",etpassword.getText().toString());
    }

    public void signUp (View view){
        TextView signup = findViewById(R.id.tvSignUp);
        startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
