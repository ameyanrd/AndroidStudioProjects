package com.example.ameya.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;

        public boolean isSquare(){

            double squareRoot = Math.sqrt(number);
            if (squareRoot == Math.floor(squareRoot))
                return true;
            else
                return false;
        }
        public boolean isTriangular() {
            int x=1;
            int triangularnumber=1;
            while(triangularnumber < number)
            {
                x++;
                triangularnumber = triangularnumber + x;
            }
            if(triangularnumber==number) return true;
            else return false;
        }

    }

    public void testNumber(View view){
        String message;
        EditText Usernumber = (EditText) findViewById(R.id.usresNumber);
        if(Usernumber.getText().toString().isEmpty()) {
            message = "Please enter any number";
        }else {
            Number num = new Number();
            num.number = Integer.parseInt(Usernumber.getText().toString());
            if (num.isSquare()) {
                if (num.isTriangular())
                    message = num.number + " is both square and triangular";
                else
                    message = num.number + " is only square";
            } else {
                if (num.isTriangular())
                    message = num.number + " is only triangular";
                else
                    message = num.number + " is neither square nor triangular";
            }
        }
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
