package com.example.ra.oscarsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ListView mListview;
    private ArrayList<ActorClass> mActorsArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListview=(ListView)findViewById(R.id.lsitView);
        mActorsArrayList = new ArrayList<>();
        ActorClass actorClass = ActorClass.getInstance();
        mActorsArrayList.add(new ActorClass("Denzel Washington", "11/11/74", "1"));
        mActorsArrayList.add(new ActorClass("Jason Bourne", "10/8/70", "1"));
        mActorsArrayList.add(new ActorClass("Jennifer Aniston", "08/15/90", "1"));

        ActorArrayAdapter adapter = new ActorArrayAdapter(this, mActorsArrayList);
        mListview.setAdapter(adapter);
    }
}
