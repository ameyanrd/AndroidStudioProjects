package com.example.ameya.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

public void clickChange(View view){

    ImageView cat1 = findViewById(R.id.imCat1);
    ImageView cat2 = findViewById(R.id.imCat2);

    Log.i("Test","Button Clicked!");

    if(cat1.getVisibility() == View.VISIBLE){
        cat1.setVisibility(View.INVISIBLE);
        cat2.setVisibility(View.VISIBLE);
    }
    else{
        cat2.setVisibility(View.INVISIBLE);
        cat1.setVisibility(View.VISIBLE);
    }
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
