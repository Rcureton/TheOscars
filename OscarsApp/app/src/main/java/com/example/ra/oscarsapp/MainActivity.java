package com.example.ra.oscarsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView mListview;
    ArrayAdapter<ActorClass> mAdapter;
    ArrayList<ActorClass> mArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListview=(ListView)findViewById(R.id.lsitView);
        mArrayList = new ArrayList<>();
        mAdapter = new ActorArrayAdapter(this, mArrayList);
        mListview.setAdapter(mAdapter);

        ActorClass actorClass = ActorClass.getInstance();

        mArrayList.add(new ActorClass("Leonardo DiCaprio", "11/11/74", "1"));
        mArrayList.add(new ActorClass("Matt Damon", "10/8/70", "1"));
        mArrayList.add(new ActorClass("Jennifer Lawrence", "08/15/90", "1"));

    }
}
