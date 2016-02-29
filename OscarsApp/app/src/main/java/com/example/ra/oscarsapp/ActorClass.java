package com.example.ra.oscarsapp;

import java.io.Serializable;

/**
 * Created by Rob on 2/29/16.
 */
public class ActorClass implements Serializable {

    private static final long serialVersionUID = 7526472295622776147L;

    public static ActorClass instance;
    String mName;
    String mDOB;
    String mOscarsWon;

    public ActorClass(String name, String dob, String oscarsWon){
        mName = "Name: " + name;
        mDOB = "DOB: " + dob;
        mOscarsWon = "Oscars won: " + oscarsWon;
    }

    public static ActorClass getInstance() {
        return instance;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDOB() {
        return mDOB;
    }

    public void setmDOB(String mDOB) {
        this.mDOB = mDOB;
    }

    public String getmOscarsWon() {
        return mOscarsWon;
    }

    public void setmOscarsWon(String mOscarsWon) {
        this.mOscarsWon = mOscarsWon;
    }
}
