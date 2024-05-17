package com.example;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.validation.constraints.NotNull;

@Factory
public class BrokenFactory {
    @Bean
    public @NotNull BeanThatDoesntNeedInterceptor noInterceptor() {
        return new BeanThatDoesntNeedInterceptor();
    }
    @Bean
    public BeanThatShouldHaveInterceptor withInterceptor() {
        return new BeanThatShouldHaveInterceptor();
    }
}
