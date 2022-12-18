package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        res=(TextView) findViewById(R.id.result);
        Bundle b = getIntent().getExtras();

        int n = Integer.parseInt(b.getString("number"));
        int r = Integer.parseInt(b.getString("range"));



        for(int i=1;i<=r;i++)
        {
            String rt = n+" * "+i+" = "+(n*i)+"\n";
            res.append(rt);
        }
    }
}