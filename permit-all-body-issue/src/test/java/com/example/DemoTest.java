package com.example;

import io.micronaut.context.env.PropertySource;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Set;

@MicronautTest
class DemoTest {
    @Inject
    EmbeddedApplication<?> application;

    @Inject
    EmbeddedServerProps server;

    @Inject
    ExampleApiClient apiClient;

    @BeforeEach
    void setup() {
        application.getEnvironment().addPropertySource(server);
    }

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

    @Singleton
    public static class EmbeddedServerProps implements PropertySource {

        @Inject
        EmbeddedServer server;

        @Override
        public String getName() {
            return "test-server-url-provider";
        }

        @Override
        public Object get(String key) {
            if (key.equals("micronaut.test.server.url")) {
                return server.getURL();
            }
            return null;
        }

        @Override
        public Iterator<String> iterator() {
            return Set.of("micronaut.test.server.url").iterator();
        }

    }

}
