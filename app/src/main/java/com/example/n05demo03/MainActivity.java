package com.example.n05demo03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
/**
 * The main activity
 * <p>
 *     A basic demo application to demonstrate the activity lifecycle
 * </p>
 *
 * @author		Levy Albert albert.school2015@gmail.com
 * @version     1.0
 * @since		20/7/2023
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity", "onCreate");
    }

    /**
     * onRestart method
     * <p> Method called after onStop method
     * </p>
     */
    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("MainActivity", "onRestart");
    }

    /**
     * onStart method
     * <p> Method called after onCreate method (1st time) or after onStop afterwards
     * </p>
     */
    @Override
    protected void onStart() {
        super.onStart();

        Log.i("MainActivity", "onStart");
    }

    /**
     * onResume method
     * <p> Method called after onStart method
     * </p>
     */
    @Override
    protected void onResume() {
        super.onResume();

        Log.i("MainActivity", "onResume");
    }

    /**
     * pass method
     * <p> Method for passing to SecondActivity
     * </p>
     *
     * @param view the view that triggered the method
     */
    public void pass(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    /**
     * exit method
     * <p> Method for ending the program
     * </p>
     *
     * @param view the view that triggered the method
     */
    public void exit(View view) {
        finish();
    }

    /**
     * onPause method
     * <p> Method called when activity get paused
     * </p>
     */
    @Override
    protected void onPause() {
        super.onPause();

        Log.i("MainActivity", "onPause");
    }

    /**
     * onStop method
     * <p> Method called when activity stopped, after onPause
     * </p>
     */
    @Override
    protected void onStop() {
        super.onStop();

        Log.i("MainActivity", "onStop");
    }

    /**
     * onDestroy method
     * <p> Method called when activity destroyed, after onStop
     * </p>
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("MainActivity", "onDestroy");
    }
}