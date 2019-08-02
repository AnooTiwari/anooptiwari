package com.example.assignment_three;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b =(Button)findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            int count =0;
            @Override
            public void onClick(View view) {
                if(count==0)
                {
                    count++;
                    Button button =(Button)findViewById(R.id.btn);
                    button.setText("off");
                }
                else
                {
                    count--;
                    Button button =(Button)findViewById(R.id.btn);
                    button.setText("ON");
                }
            }
        });
    }
}
