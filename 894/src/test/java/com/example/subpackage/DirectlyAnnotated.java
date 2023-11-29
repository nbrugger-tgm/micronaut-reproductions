package com.example.subpackage;

import com.example.Application;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@AllArgsConstructor
@MicronautTest
class DirectlyAnnotated {
    private final Application application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }


    @Nested
    class NestedTest {
        @Test
        void testItWorks() {
            Assertions.assertTrue(application.isRunning());
        }
    }
}
