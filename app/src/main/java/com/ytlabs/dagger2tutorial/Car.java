package com.ytlabs.dagger2tutorial;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject
    public Engine engine;
    private Wheels wheels;

    // Inject annotation on constructor tells Dagger how to provide the
    // object of Car class
    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    // Method injection: Needed when the instance of the object(this) is
    // itself passed to the dependency(Remote). Constructor injection triggers
    // field injection, which triggers method injection, hence this method is
    // automatically called.
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG, "driving...");
    }

}
