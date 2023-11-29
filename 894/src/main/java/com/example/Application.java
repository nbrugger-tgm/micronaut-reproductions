package com.example;

import io.micronaut.runtime.Micronaut;
import jakarta.inject.Singleton;

@Singleton
public class Application {
    public boolean isRunning() {
        return true;
    }
}