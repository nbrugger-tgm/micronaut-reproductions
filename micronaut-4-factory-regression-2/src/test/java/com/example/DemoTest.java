package com.example;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.validation.ValidationException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class DemoTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Test
    void canInjectClassCallingInConstructor() {
        ClassCallingInConstructor classCallingInConstructor = application.getApplicationContext().getBean(ClassCallingInConstructor.class);
        Assertions.assertThrows(ValidationException.class, ()->classCallingInConstructor.setAge(null));
        Assertions.assertNotNull(classCallingInConstructor);
    }

}
