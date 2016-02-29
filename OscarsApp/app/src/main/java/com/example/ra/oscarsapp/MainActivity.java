package com.example.ra.oscarsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ListView mListview;
    private ArrayList<ActorClass> mActorsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListview=(ListView)findViewById(R.id.lsitView);
        mActorsList = new ArrayList<>();
        ActorClass actorClass = ActorClass.getInstance();
        mActorsList.add(new ActorClass("Christopher Walken", "03/31/43", "Not sure"));
        mActorsList.add(new ActorClass("Hannibal Buress", "04/04/83", "Probably none"));
        mActorsList.add(new ActorClass("Rhea Seehorn", "1972", "Not sure, but should get many"));

        ActorArrayAdapter adapter = new ActorArrayAdapter(this, mActorsList);
        mListview.setAdapter(adapter);
    }
}
