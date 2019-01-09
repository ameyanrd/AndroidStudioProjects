package com.example.ameya.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText number = (EditText) findViewById(R.id.etNumber);

        double d = Double.parseDouble(number.getText().toString())*0.77;
        String s = String.valueOf(d);

        Toast.makeText(MainActivity.this,"£"+s,Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
