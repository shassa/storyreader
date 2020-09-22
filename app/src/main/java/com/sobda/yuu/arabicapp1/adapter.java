package com.sobda.yuu.arabicapp1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends BaseAdapter {
    private ArrayList<topic> topics;
    private Context context;

    adapter(ArrayList<topic> topics, Context context) {
        this.topics = topics;
        this.context = context;
    }

    @Override
    public int getCount() {
        return topics.size();
    }

    @Override
    public Object getItem(int position) {
        return topics.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
     LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
     View view=inflater.inflate(R.layout.row,parent,false);
     ImageView imageView=view.findViewById(R.id.image112);
     TextView title=view.findViewById(R.id.title112);
     TextView contan=view.findViewById(R.id.contan);
     imageView.setImageResource(topics.get(position).getImsge());
     title.setText(topics.get(position).getTitle());
     contan.setText(topics.get(position).getContan());
     return view;
    }
}
