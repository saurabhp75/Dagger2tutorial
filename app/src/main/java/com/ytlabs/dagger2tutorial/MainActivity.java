package com.ytlabs.dagger2tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // Tell Dagger that this field has to be injected
    // The field should be public so that Dagger can access it
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Use Dagger CarComponent to inject the car field
        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
        car.drive();
    }
}