package com.sobda.yuu.arabicapp1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    private final static String key="key";
  ListView listView;
  String[] titles={"Alphabet:الحروف","Colors:الالوان","Pronouns:الضمائر","Notes:ملاحظات","Date:التاريخ","Family:العائلة","Seasons: فصول","Place:مكان","Time:زمن","Simple Phrases:جمل بسيطة"};
  String[] contan={"Alphabet:الحروف","Colors:الالوان","Pronouns:الضمائر","Notes:ملاحظات","Date:التاريخ","Family:العائلة","Seasons: فصول","Place:مكان","Time:زمن","Simple Phrases:جمل بسيطة"};
int[] image ={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a10,R.drawable.a9};
private adapter adapter;
ArrayList<topic> topisc =new ArrayList<>();
int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listview);
        for (int i=0;i<titles.length;i++){
            topic topic =new topic(titles[i],contan[i],image[i]);
            topisc.add(topic);

        }


        adapter=new adapter(topisc,this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                val=position;
                intent.putExtra(key,val);
                startActivity(intent);
            }
        });

    }

}