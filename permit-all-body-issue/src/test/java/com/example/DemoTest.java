package com.example;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class DemoTest {
    @Inject
    EmbeddedApplication<?> application;

    @Inject
    ExampleApiClient apiClient;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Test
    void canAccessWithoutBody() {
        apiClient.withoutBody();
    }

    @Test
    void canAccessWithBody() {
        apiClient.withBody("Hallo Welt");
    }

    @Test
    void canAccessWithHeader() {
        apiClient.withHeader("Hallo Welt");
    }

    @Test
    void canAccessWithQuery() {
        apiClient.withQuery("Hallo Welt");
    }
}
