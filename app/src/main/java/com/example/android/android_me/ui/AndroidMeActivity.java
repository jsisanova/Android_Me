package com.example.android.android_me.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        // Create a new head BodyPartFragment
        BodyPartFragment headFragment = new BodyPartFragment();

        // TODO (4) Set the list of image id's for the head fragment and set the position to the second image in the list
        headFragment.setImageIds(AndroidImageAssets.getHeads());
        headFragment.setListIndex(1);

        // Add the fragment to its container using a FragmentManager and a Transaction
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                // add fragment and embed it in host activity
                // you can make multiple different or same calls during same fragment transaction
                .add(R.id.head_container, headFragment)
                // to completel transaction
                .commit();

        // TODO (5) Create and display the body and leg BodyPartFragments
        BodyPartFragment bodyFragment = new BodyPartFragment();
        bodyFragment.setImageIds(AndroidImageAssets.getBodies());
        fragmentManager.beginTransaction()
                .add(R.id.body_container, bodyFragment)
                .commit();

        BodyPartFragment legFragment = new BodyPartFragment();
        legFragment.setImageIds(AndroidImageAssets.getLegs());
        fragmentManager.beginTransaction()
//                .replace(containerID, someNewFragment)
                .add(R.id.leg_container, legFragment)
                .commit();

    }
}
