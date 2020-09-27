package com.ytlabs.dagger2tutorial.dagger;

import com.ytlabs.dagger2tutorial.car.Engine;
import com.ytlabs.dagger2tutorial.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    // This is better than Provides as no object of PetrolEngineModule is
    // created and no method is called, instead PetrolEngine is instantiated directly
    // It is used when we want to bind an implementation to an interface. Also this
    // module cannot have provide method as that would require an instance of the module
    // But we can use static methods as we did previously.
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
