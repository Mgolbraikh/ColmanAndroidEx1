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

        this.finish();
        //askdflajsfdkljaskldfj
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "onStarting of activity 2" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag", "OnRestart of activity 2");
    }

    protected void  onResume()
    {
        super.onResume();
        Log.d("tag", "OnResume of activity 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","OnPause of activity 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","onStop of activity 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "onDestroy of activity 2");
    }
}
