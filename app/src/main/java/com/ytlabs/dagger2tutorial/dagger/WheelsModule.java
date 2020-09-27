package com.ytlabs.dagger2tutorial.dagger;

import com.ytlabs.dagger2tutorial.car.Rims;
import com.ytlabs.dagger2tutorial.car.Tires;
import com.ytlabs.dagger2tutorial.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    //Note: The methods are static as they don't need instance of WheelsModule

    // Provides annotation tells Dagger how to provide the instance (return type)
    // Name of the method is not relevant.
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    // Modules can also be used to configure the instances(inflate()) as in the method below
    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
