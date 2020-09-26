package com.ytlabs.dagger2tutorial;

import javax.inject.Inject;

public class Engine {

    // Inject annotation on constructor tells Dagger how to provide the
    // object of Engine class
    @Inject
    public Engine() {
    }
}
