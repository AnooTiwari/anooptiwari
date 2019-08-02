package com.example.assign2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class car extends AppCompatActivity {
      Button ford,tata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        ford=(Button)findViewById(R.id.btnf);
        final ImageView imageView=(ImageView)findViewById(R.id.img2);
        ford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.ford);
            }
        });
        tata=(Button)findViewById(R.id.btnt);
        tata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.tata);
            }
        });
    }
}
