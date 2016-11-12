package com.example.owner.ex1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        Log.d("tag", "onStarting of activity 1" );
    }

    @Override
    protected void onRestart() {
        Log.d("tag", "OnRestart of activity 1");
    }

    protected void  onResume()
    {
        Log.d("tag", "OnResume of activity 1");
    }

    @Override
    protected void onPause() {
        Log.d("tag","OnPause of activity 1");
    }

    @Override
    protected void onStop() {
        Log.d("tag","onStop of activity 1");
    }

    @Override
    protected void onDestroy() {
        Log.d("tag", "onDestroy of activity 1");
    }
}
