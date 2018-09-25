package com.angeles.steffany;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d( "4ITG", "onCreate() has executed.. ");
    }

    protected void onStart(){
        super.onStart();
        Log.d( "4ITG", "onStart() has executed..");
    }

    protected void onResume(){
        super.onResume();
        Log.d( "4ITG", "onResume() has executed..");
    }

    protected void onPause(){
        super.onPause();
        Log.d( "4ITG", "onPause() has executed..");
    }

    protected void onStop(){
        super.onStop();
        Log.d( "4ITG", "onStop() has executed..");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d( "4ITG", "onRestart() has executed..");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d( "4ITG", "onDestroy has executed..");
    }

    public void Back(View v){
        Toast.makeText(this , "back button clicked", Toast.LENGTH_LONG).show();
    }

    public void Next(View v){
        Snackbar.make(v, "Next button clicked ", Snackbar.LENGTH_LONG).show();
    }
}
