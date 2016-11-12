package com.example.owner.ex1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Activity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "onStarting of activity 3" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag", "OnRestart of activity 3");
    }

    protected void  onResume()
    {
        super.onResume();
            Log.d("tag", "onResume of activity 3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","OnPause of activity 3");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","onStop of activity 3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "onDestroy of activity 3");
    }
}
