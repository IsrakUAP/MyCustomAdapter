package com.example.mycustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    int [] flags;
    String [] countyNames;
    Context context;
    private ImageView imageView;
    private LayoutInflater inflater;


    CustomAdapter(Context context,String [] countyNames,int [] flags){
        this.context=context;
        this.countyNames=countyNames;
        this.flags=flags;

    }
    @Override
    public int getCount() {
        return countyNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){

           inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view,parent,false);
        }

        imageView =convertView.findViewById(R.id.imageViewId);
        TextView textView =convertView.findViewById(R.id.countryNameId);
        imageView.setImageResource(flags[position]);
        textView.setText(countyNames[position]);

        return convertView;
    }
}
