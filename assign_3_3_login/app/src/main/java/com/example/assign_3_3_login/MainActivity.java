package com.example.assign_3_3_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login ,btn2;
    int k=0,l=0;
    TextView textView;
    Context context;

    String u,p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        textView=findViewById(R.id.tv1);
        btn2=findViewById(R.id.move);
        context = this;
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               u= username.getText().toString();
               p= password.getText().toString();

                for(int i=0; i<u.length();i++){
                    char c = u.charAt(i);

                    if((c>='A'&& c<='Z')||(c>='a'&& c<='z'))
                    {

                        k=0;
                    }else
                        k=1;

                }

                for(int i=0; i<p.length();i++){
                    char c = p.charAt(i);

                    if((c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') ||(c == '$' || c == '-' || c == '@')||c>'0'&&c<='9')
                    {

                        l=0;
                    }else
                        l=1;

                }
                if(Objects.equals(u, "Securifi")&&Objects.equals(p,"Lumia540@"))
                {
                    textView.setText("Login Success\n"+u+"\n"+p);

                }else
                {
                    if(k==1)
                    textView.setText("\nOnly A-Z & a-z are allow");
                    else if(l==1)
                        textView.setText(l+"Login Fail\nPassword must contain alphabet and $,-,@ are allow\n"+u+"\n"+p);
                    else
                        textView.setText(l+"Login Fail\n"+u+"\n"+p);

                }


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("username", u);
                intent.putExtra("password", p);
                startActivity(intent);
            }
        });



    }

}

/*
/*******************************************************************************************************************
                                                code for stick Ristriction
* package com.example.assign_3_3_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Scanner;
import android.widget.TextView;


import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login ,change;
    int k=0,l=0;
    TextView textView;
    Context context;

    String u,p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        textView=findViewById(R.id.tv1);
        context = this;
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               u= username.getText().toString();
               p= password.getText().toString();

                for(int i=0; i<u.length();i++){
                    char c = u.charAt(i);

                    if((c>='A'&& c<='Z')||(c>='a'&& c<='z'))
                    {

                        k=0;
                    }else
                        k=1;

                }

                 if(p.matches(".*[0-9]{1,}.*") && p.matches(".*[@#$]{1,}.*") && p.length()>=6 && p.length()<=20)
                        {
                            l=0;
                        }
                 else
                 {
                     l=1;
                 }

                if(Objects.equals(u, "Securifi")&&Objects.equals(p,"Lumia540@"))
                {
                    textView.setText("Login Success\n"+u+"\n"+p);

                }else
                {
                    if(k==1)
                    textView.setText("\nOnly A-Z & a-z are allow");
                    else
                        if(l==1)
                        {
                            textView.setText("Login Fail\nPassword must be X,0-9,x,$,@,#,lenght b/w 6 to 20"+u+"\n"+p);
                        }

                        else
                        textView.setText("Login Fail\n"+u+"\n"+p);

                }


            }
        });



    }

}

*
* */