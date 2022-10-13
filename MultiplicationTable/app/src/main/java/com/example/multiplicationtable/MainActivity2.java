package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();

        int no = Integer.parseInt(b.getString("number"));
        int range = Integer.parseInt(b.getString("range"));

        result = (TextView) findViewById(R.id.res);
        for(int i=1;i<=range;i++)
        {
            String res = no+" * "+i+" = "+(i*no)+"\n";
            result.append(res);
        }
    }
}