package com.example.assign_3_3_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
//    String m = getIntent().getStringExtra("ID");
//    String n = getIntent().getStringExtra("Pass");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.tv2);

        Intent intent = getIntent();

        String uname = intent.getStringExtra("username");
        String pass = intent.getStringExtra("password");
        textView.setText("\n"+uname+"\n"+pass);

    }

}
