package com.example;

import io.micronaut.core.annotation.Introspected;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Size;

@Introspected
public class HelloWorldDto {
    @Nullable
    @Size(min=5,max=5)
    private String hello;
    @io.micronaut.core.annotation.Nullable
    @javax.validation.constraints.Size(min=5,max=5)
    private String world;

    public HelloWorldDto(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }

    public String getHello() {
        return hello;
    }

    public String getWorld() {
        return world;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
