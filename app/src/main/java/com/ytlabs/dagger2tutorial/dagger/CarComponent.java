package com.ytlabs.dagger2tutorial.dagger;

import com.ytlabs.dagger2tutorial.MainActivity;
import com.ytlabs.dagger2tutorial.car.Car;

import dagger.Component;

// Component creates and store the objects/instances and provides when needed
@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    // The method name doesn't matter, only the return type,
    // which tells Dagger what object this component will provide
    Car getCar();

    // Tell Dagger which class(argument) needs the field injection.
    // The name of method is not relevant, only the argument is.
    void inject(MainActivity mainActivity);
}
