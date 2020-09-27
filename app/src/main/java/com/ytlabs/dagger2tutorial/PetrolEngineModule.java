package com.ytlabs.dagger2tutorial;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    // This is better than Provides as no object of PetrolEngineModule is
    // created and no method is called, instead PetrolEngine is instantiated directly
    // It is used when we want to bind an implementation to an interface. Also this
    // module cannot have provide method as that would require an instance of the module
    // But we can use static methods as we did previously.
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
