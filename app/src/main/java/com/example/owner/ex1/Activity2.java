package com.example.owner.ex1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        Log.d("tag", "onStarting of activity 2" );
    }

    @Override
    protected void onRestart() {
        Log.d("tag", "OnRestart of activity 2");
    }

    protected void  onResume()
    {
        Log.d("tag", "OnResume of activity 2");
    }

    @Override
    protected void onPause() {
        Log.d("tag","OnPause of activity 2");
    }

    @Override
    protected void onStop() {
        Log.d("tag","onStop of activity 2");
    }

    @Override
    protected void onDestroy() {
        Log.d("tag", "onDestroy of activity 2");
    }

}
