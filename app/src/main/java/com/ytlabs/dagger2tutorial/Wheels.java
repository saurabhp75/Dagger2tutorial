package com.ytlabs.dagger2tutorial;

import javax.inject.Inject;

public class Wheels {

    // Inject annotation on constructor tells Dagger how to provide the
    // object of Wheels class
    @Inject
    public Wheels() {
    }
}
