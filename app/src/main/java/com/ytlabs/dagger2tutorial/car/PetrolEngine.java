package com.ytlabs.dagger2tutorial.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;

    @Inject
    public PetrolEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started. Horsepower: " + horsePower);
        
    }
}
