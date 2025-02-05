package com.example;

import io.micronaut.http.annotation.Controller;
import jakarta.annotation.security.PermitAll;

@Controller
public class ExampleController implements ExampleApi {
    @Override
    @PermitAll
    public String withoutBody() {
        return "I got no body yay";
    }

    @Override
    public String withQuery(String query) {
        return "I got a query yay";
    }

    @Override
    public String withHeader(String header) {
        return "I got a header yay";
    }

    @Override
    @PermitAll
    public String withBody(String body) {
        return "I got a body yay";
    }
}
