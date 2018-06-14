package com.example.lalit.bulb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void gb(View view){
        ImageView green = (ImageView) findViewById(R.id.greenBulb); //store the bulb image in green variable
        ImageView blue = (ImageView) findViewById(R.id.blueBulb); //store the bulb image in green variable
        ImageView red = (ImageView) findViewById(R.id.redBulb); //store the bulb image in green variable

        green.animate().alpha(1).setDuration(1000);
        blue.animate().alpha(0).setDuration(1000);
        red.animate().alpha(0).setDuration(1000);

    }
    public void bb(View view){
        ImageView Blue = (ImageView) findViewById(R.id.blueBulb); //store the bulb image in green variable
        ImageView Green = (ImageView) findViewById(R.id.greenBulb); //store the bulb image in green variable
        ImageView red = (ImageView) findViewById(R.id.redBulb); //store the bulb image in green variable

        Blue.animate().alpha(1).setDuration(1000);
        Green.animate().alpha(0).setDuration(1000);
        red.animate().alpha(0).setDuration(1000);

    }
    public void rb(View view){
        ImageView red = (ImageView) findViewById(R.id.redBulb);
        ImageView Green = (ImageView) findViewById(R.id.greenBulb);
        ImageView Blue = (ImageView) findViewById(R.id.blueBulb);
        red.animate().alpha(1).setDuration(1000);
        Green.animate().alpha(0).setDuration(1000);
        Blue.animate().alpha(0).setDuration(1000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
