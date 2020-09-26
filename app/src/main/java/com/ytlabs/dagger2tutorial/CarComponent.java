package com.ytlabs.dagger2tutorial;

import dagger.Component;

// Component creates and store the objects/instances and provides when needed
@Component
public interface CarComponent {

    // The method name doesn't matter, only the return type,
    // which tells Dagger what object this component will provide
    Car getCar();
}
