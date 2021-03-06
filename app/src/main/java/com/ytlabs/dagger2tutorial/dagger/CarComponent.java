package com.ytlabs.dagger2tutorial.dagger;

import com.ytlabs.dagger2tutorial.MainActivity;
import com.ytlabs.dagger2tutorial.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

// Component creates and store the objects/instances and provides when needed
@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    // The method name doesn't matter, only the return type,
    // which tells Dagger what object this component will provide
    Car getCar();

    // Tell Dagger which class(argument) needs the field injection.
    // The name of method is not relevant, only the argument is.
    void inject(MainActivity mainActivity);

    // Define API for CarComponent builder ourselves
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
