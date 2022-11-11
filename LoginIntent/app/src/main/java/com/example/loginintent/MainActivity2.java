package com.example.loginintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView uname,passu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        uname = (TextView)findViewById(R.id.ures);
        passu = (TextView)findViewById(R.id.passres);

        Intent i = getIntent();
        String u = i.getStringExtra("us_name");
        String p = i.getStringExtra("pass_key");

        uname.setText(u);
        passu.setText(p);



    }
}