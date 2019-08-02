package com.example.five_new;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView Image;
    Button hide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Image = (ImageView)findViewById(R.id.imageView1);

        hide = (Button)findViewById(R.id.button1);



        hide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Image.setVisibility(View.INVISIBLE);

            }
        });
    }
}
