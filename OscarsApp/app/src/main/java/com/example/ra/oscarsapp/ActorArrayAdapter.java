package com.example.ra.oscarsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rob on 2/29/16.
 */
public class ActorArrayAdapter extends ArrayAdapter<ActorClass> {

    ArrayList<ActorClass> mActors;

    public ActorArrayAdapter(Context context, ArrayList<ActorClass> actors) {
        super(context, -1);

        mActors = actors;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ActorClass actorList = mActors.get(position);

        Context context = getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View actorLayoutView = inflater.inflate(R.layout.custom_listview_layout, parent, false);

        TextView actorName = (TextView) actorLayoutView.findViewById(R.id.actor_name);
        TextView actorDOB = (TextView) actorLayoutView.findViewById(R.id.actor_dob);
        TextView actorWon = (TextView) actorLayoutView.findViewById(R.id.oscars_won);

        actorName.setText(actorList.getmName());
        actorDOB.setText(actorList.getmDOB());
        actorWon.setText(actorList.getmOscarsWon());

        return actorLayoutView;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}