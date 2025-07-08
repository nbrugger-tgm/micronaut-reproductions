package com.example.controller;

import io.micronaut.http.annotation.Controller;

@Controller
public class BrokenPingResource implements PingService {
    @Override
    public String ping() {
        return "pong";//This isn't working -> no response given
    }
}
