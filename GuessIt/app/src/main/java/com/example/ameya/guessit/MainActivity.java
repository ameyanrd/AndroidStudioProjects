package com.example.ameya.guessit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int pickedNumber;

    public void makeToast(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void guessIt (View v) {
        EditText number = (EditText) findViewById(R.id.etNumber);
        int i = Integer.parseInt(number.getText().toString());
        if (i > pickedNumber) {
            makeToast("Entered Number is Greater");
        } else if (i < pickedNumber) {
            makeToast("Entered Number is Smaller");
        } else {
            makeToast("That's my Number! Try Again");
            Random rand = new Random();
            pickedNumber = rand.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        pickedNumber = rand.nextInt(20) + 1;
    }
}
