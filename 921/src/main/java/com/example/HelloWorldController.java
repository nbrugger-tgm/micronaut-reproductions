package com.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloWorldController {
    @Get("/")
    public HelloWorldDto helloWorld(@Body HelloWorldDto dto) {
        return dto;
    }
}
