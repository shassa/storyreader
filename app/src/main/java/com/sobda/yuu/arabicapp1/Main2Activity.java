package com.sobda.yuu.arabicapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
int[] topics={R.string.ahrof,R.string.alwan,R.string.eldamayr,R.string.nots,R.string.date,R.string.family,R.string.seasons,R.string.place,R.string.time,R.string.simple
};
    int[] image ={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a10,R.drawable.a9};

TextView textView;
    private final static String key="key";

ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView =findViewById(R.id.contantext);
        imageView=findViewById(R.id.imagetop);

        Intent intent=getIntent();
        int tem=intent.getIntExtra(key,0);
        textView.setText(topics[tem]);
        imageView.setImageResource(image[tem]);

    }
}
