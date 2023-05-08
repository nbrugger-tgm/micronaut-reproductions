package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Singleton;
import org.junit.jupiter.api.Test;

@MicronautTest
class DataUpdateInterceptorTest {
    DataUpdateInterceptorTest(Outer.Inner inner, Outer outer) {
        this.inner = inner;
        this.outer = outer;
    }

    @Singleton
    static class Outer {
        @Singleton
        class Inner {
        }
    }
    private final Outer.Inner inner;
    private final Outer outer;
    @Test
    void isInjected(){}
}
