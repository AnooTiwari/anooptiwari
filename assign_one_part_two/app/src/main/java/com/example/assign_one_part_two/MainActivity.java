package com.example.assign_one_part_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        TextView tv = (TextView) findViewById(R.id.tv1);
//        tv.setText("HELLO SECURIFI ");
        LinearLayout lView = new LinearLayout(this);

        TextView myText = new TextView(this);
        myText.setText("\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\tHELLO SECURIFI");


        lView.addView(myText);

        setContentView(lView);


    }
}
