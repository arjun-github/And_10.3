package com.acadgild.fragmentcustomlist;

import android.app.ListActivity;
import android.os.Bundle;

/**
 * MainActivity extends ListActivity and is used to inflate the fragment List
 */
public class MainActivity extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Loading main layout
        getFragmentManager().findFragmentById(R.id.fragmentlist);

    }
}