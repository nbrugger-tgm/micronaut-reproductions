package com.example.subpackage;

import com.example.Application;
import io.micronaut.runtime.EmbeddedApplication;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;

@AllArgsConstructor
@MetaAnnotationWithMicronautTest
class DemoTest {
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
