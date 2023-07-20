package com.example.n05demo03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

/**
 * The second activity
 * <p>
 *     A basic demo application to demonstrate the activity lifecycle
 * </p>
 *
 * @author		Levy Albert albert.school2015@gmail.com
 * @version     1.0
 * @since		20/7/2023
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    /**
     * back method
     * <p> Method for ending second actvity & returning to MainActivity
     * </p>
     *
     * @param view the view that triggered the method
     */
    public void back(View view) {
        finish();
    }
}