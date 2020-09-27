package com.ytlabs.dagger2tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ytlabs.dagger2tutorial.car.Car;
import com.ytlabs.dagger2tutorial.dagger.CarComponent;
import com.ytlabs.dagger2tutorial.dagger.DaggerCarComponent;
import com.ytlabs.dagger2tutorial.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Use Dagger CarComponent to inject the car field
        // Create method is available only if none of the modules in the component take
        // any argument in the constructor.
        // horsepower will be added to the dependency graph and value of 100 will be
        // taken whenever we need an integer.
        CarComponent component1 = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        CarComponent component2 = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        // This will give two different drivers as driver is singleton only
        // within a component.
        component1.getCar().drive();
        component2.getCar().drive();
    }
}