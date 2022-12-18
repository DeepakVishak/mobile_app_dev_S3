package com.example.listview_implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView l;
    String faang[]={"Facebook","Amazon","Apple","Netflix","Google"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.faang_list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,faang);
        l.setAdapter(arr);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                   //Facebook
                    Intent f= new Intent(Intent.ACTION_VIEW);
                    f.setData(Uri.parse("https://www.facebook.com/"));
                    startActivity(f);
                }
                else if(i==1)
                {
                    //Amazon
                    Intent az= new Intent(Intent.ACTION_VIEW);
                    az.setData(Uri.parse("https://www.amazon.in/"));
                    startActivity(az);
                }
                else if(i==2)
                {
                    //Apple
                    Intent ap= new Intent(Intent.ACTION_VIEW);
                    ap.setData(Uri.parse("https://www.apple.com/"));
                    startActivity(ap);
                }
                else if(i==3)
                {
                    //Netflix
                    Intent n= new Intent(Intent.ACTION_VIEW);
                    n.setData(Uri.parse("https://www.netflix.com/"));
                    startActivity(n);
                }
                else
                {
                    //Google
                    Intent g= new Intent(Intent.ACTION_VIEW);
                    g.setData(Uri.parse("https://www.google.co.in/"));
                    startActivity(g);
                }
            }
        });
    }
}