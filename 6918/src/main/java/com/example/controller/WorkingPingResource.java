package com.example.controller;

import io.micronaut.http.annotation.Controller;

@Controller
public class WorkingPingResource implements ManualPingService{
    @Override
    public String ping() {
        return "pong";
    }
}
