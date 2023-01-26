package com.example.alaska_x_aceh_x_byuh_androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainSplashScreen extends AppCompatActivity {

    private Handler mHandler;
    private Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                Intent tent = new Intent(MainSplashScreen.this, MainActivity.class);
                startActivity(tent);
            }
        };
        mHandler.postDelayed(mRunnable, 5000);
    }
}