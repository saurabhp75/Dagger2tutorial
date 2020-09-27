package com.ytlabs.dagger2tutorial;

import javax.inject.Inject;

public class Wheels {

    //we don't own this class so we can't annotate it's constructor/field with @Inject
    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
