package com.example.six;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView sampleImage;
    Button show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            final ImageView imageView = (ImageView)findViewById(R.id.imageView1);
            show = (Button)findViewById(R.id.button1);
            show.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageResource(R.drawable.mario);
                }
            });
    }
}
