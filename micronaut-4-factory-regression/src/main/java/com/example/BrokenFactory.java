package com.example;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.validation.constraints.NotNull;

@Factory
public class BrokenFactory {
    @Bean
    public @NotNull ClassCallingInConstructor somePerson() {
        return new ClassCallingInConstructor("10");
    }
}
