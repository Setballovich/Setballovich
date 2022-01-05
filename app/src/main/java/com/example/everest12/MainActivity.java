package com.example.everest12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private void showSecondActivityWithDelay(int waitTime) {
        Handler handler = new Handler( );
        handler.postDelayed(new Runnable( ) {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        }, waitTime);
    }

    @Override
    protected void onStart() {
        super.onStart( );
        showSecondActivityWithDelay(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}