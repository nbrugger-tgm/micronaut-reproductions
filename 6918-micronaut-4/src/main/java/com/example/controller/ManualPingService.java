package com.example.controller;

import io.micronaut.http.annotation.Get;

/**
 * Handwritten variant (same as {@link PingService}
 */
public interface ManualPingService {
    @Get("/ping2")
    String ping();
}
