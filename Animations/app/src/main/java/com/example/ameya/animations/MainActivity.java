package com.example.ameya.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade (View view){
        ImageView tom = (ImageView) findViewById(R.id.tom);
      //  ImageView jerry = (ImageView) findViewById(R.id.jerry);
        tom.animate().rotationBy(360).scaleX(0.5f).scaleY(0.5f).translationXBy(500f).translationYBy(500f).setDuration(5000);
        //jerry.animate().alpha(1f).setDuration(2000);.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        ImageView tom = (ImageView) findViewById(R.id.tom);

        tom.setTranslationX(-1000f);
        */
    }
}
