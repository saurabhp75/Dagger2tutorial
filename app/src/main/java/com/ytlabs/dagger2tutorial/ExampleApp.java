package com.ytlabs.dagger2tutorial;

import android.app.Application;

import com.ytlabs.dagger2tutorial.dagger.CarComponent;
import com.ytlabs.dagger2tutorial.dagger.DaggerCarComponent;

public class ExampleApp extends Application {
    private CarComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerCarComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .build();
    }

    public CarComponent getAppComponent() {
        return component;
    }
}
