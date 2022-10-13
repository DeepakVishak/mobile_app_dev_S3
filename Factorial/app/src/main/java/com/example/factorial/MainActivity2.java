package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        int n = Integer.parseInt(b.getString("number"));
        long f = 1;

        for(int i = n; i > 0 ; i--){
            f = f * i;
        }

        res = findViewById(R.id.res);
        res.setText("Factorial of "+ n + " is "+f);
    }
}