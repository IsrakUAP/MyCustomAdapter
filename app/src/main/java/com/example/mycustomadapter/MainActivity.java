package com.example.mycustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String [] countryNames;
    private int [] flags = {R.drawable.afghanistan,R.drawable.india,R.drawable.pakistan,R.drawable.bangladesh,R.drawable.china};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryNames = getResources().getStringArray(R.array.country_names);
        listView = findViewById(R.id.listViewId);
        CustomAdapter adapter= new CustomAdapter(this, countryNames, flags);
        listView.setAdapter(adapter);

    }
}