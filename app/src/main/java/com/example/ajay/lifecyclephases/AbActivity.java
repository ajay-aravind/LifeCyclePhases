package com.example.ajay.lifecyclephases;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.logging.Logger;

/**
 * Created by ajay on 30/8/17.
 */

abstract  class AbActivity extends AppCompatActivity{

    String TAG=getClass().getName();
    @Override
     protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,new Object(){}.getClass().getEnclosingMethod().getName());
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,new Object(){}.getClass().getEnclosingMethod().getName());
    }

    void setTAG()
    {
        TAG=getClass().getSimpleName();
    }
}
