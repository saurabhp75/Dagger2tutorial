package com.ytlabs.dagger2tutorial;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }
}
