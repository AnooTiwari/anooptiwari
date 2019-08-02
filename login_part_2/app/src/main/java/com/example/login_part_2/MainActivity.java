package com.example.login_part_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(v);
            }

            private void change(View v) {

                Intent intent = new Intent(MainActivity.this, page2.class);
                startActivity(intent);
            }
        });


    }
}
