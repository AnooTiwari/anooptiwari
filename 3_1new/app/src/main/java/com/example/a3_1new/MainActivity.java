package com.example.a3_1new;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    CheckBox prod1, prod2,  prod3;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prod1 = findViewById(R.id.product1);
        prod2 = findViewById(R.id.product2);
        prod3 =  findViewById(R.id.product3);
        textView = findViewById(R.id.tv);
        button =  findViewById(R.id.finalbtn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {

            @Override
          public void onClick(View v) {
                String msg="";
                if(prod1.isChecked())
                    msg = msg + " Product1 ";
                if(prod2.isChecked())
                    msg = msg + " Product2 \n";
                if(prod3.isChecked())
                    msg = msg + " Product3 \n";

                textView.setText(msg);

            }
        });
    }
}

