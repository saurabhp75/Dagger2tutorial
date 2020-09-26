package com.ytlabs.dagger2tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This will give a runtime time exception as "car" is not initialized
        // We need to inject "car"
        car.drive();
    }
}