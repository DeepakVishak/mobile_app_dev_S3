package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText n;
    EditText r;
    Button mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n = (EditText) findViewById(R.id.num);
        r = (EditText) findViewById(R.id.range);
        mul = (Button) findViewById(R.id.m_table);

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("number", n.getText().toString());
                i.putExtra("range", r.getText().toString());
                startActivity(i);

            }
        });


    }
}