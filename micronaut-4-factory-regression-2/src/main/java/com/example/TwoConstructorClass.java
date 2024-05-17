package com.example;

import jakarta.validation.constraints.NotNull;

public class TwoConstructorClass {
    public TwoConstructorClass() {
        this("10");
    }
    public TwoConstructorClass(String age) {
    }
}
