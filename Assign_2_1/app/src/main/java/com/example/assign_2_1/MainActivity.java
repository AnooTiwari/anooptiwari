package com.example.assign_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
//    public void Method5(View v) {
//
//        Toast.makeText(getApplicationContext(),"Center Button Clicked",Toast.LENGTH_SHORT).show();
//    }
//    public void Method4(View v) {
//
//        Toast.makeText(getApplicationContext(),"button 4 is clicked",Toast.LENGTH_SHORT).show();
//    }
//    public void Method3(View v) {
//
//        Toast.makeText(getApplicationContext(),"button 3 is clicked",Toast.LENGTH_SHORT).show();
//    }
//    public void Method2(View v) {
//
//        Toast.makeText(getApplicationContext(),"button 2 is clicked",Toast.LENGTH_SHORT).show();
//    }
//    public void Method1(View v) {
//
//        Toast.makeText(getApplicationContext(),"button 1 is clicked",Toast.LENGTH_SHORT).show();
//    }


    public void method(View v) {
        if(v.getId()==R.id.button1)
        {
            Toast.makeText(getApplicationContext(),"button 1 is clicked",Toast.LENGTH_LONG).show();
        }
        else
            if (v.getId()==R.id.button2)
            {
                Toast.makeText(getApplicationContext(),"button 2 is clicked",Toast.LENGTH_LONG).show();
            }
            else
                if (v.getId()==R.id.button3)
                {
                    Toast.makeText(getApplicationContext(),"button 3 is clicked",Toast.LENGTH_LONG).show();
                }
                else
                    if (v.getId()==R.id.button4)
                    {
                        Toast.makeText(getApplicationContext(),"button 4 is clicked",Toast.LENGTH_LONG).show();

                    }
                    else
                        if (v.getId()==R.id.button5)
                        {
                            Toast.makeText(getApplicationContext(),"button 5 is clicked",Toast.LENGTH_LONG).show();
                        }

    }
}
