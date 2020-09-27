package com.ytlabs.dagger2tutorial.dagger;

import com.ytlabs.dagger2tutorial.car.DieselEngine;
import com.ytlabs.dagger2tutorial.car.Engine;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsepower;

    public DieselEngineModule(int horsepower) {
        this.horsepower = horsepower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsepower);
    }
}
