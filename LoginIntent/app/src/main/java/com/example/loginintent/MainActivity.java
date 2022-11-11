package com.example.loginintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        sub = (Button) findViewById(R.id.submit);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = username.getText().toString();
                String p = password.getText().toString();

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("us_name",u);
                intent.putExtra("pass_key",p);

                startActivity(intent);
            }
        });
    }
}