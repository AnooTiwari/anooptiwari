package com.example.assign2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class bike extends AppCompatActivity {
    Button yamaha,honda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike);
        yamaha =(Button)findViewById(R.id.btnY);
        final ImageView imageView=(ImageView)findViewById(R.id.img3);
        yamaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.yamaha);
            }
        });
        honda=(Button)findViewById(R.id.btnH);
        honda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.honda);
            }
        });
    }
}
