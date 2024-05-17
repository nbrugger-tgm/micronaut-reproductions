package com.example;

import jakarta.validation.constraints.NotNull;

public class ClassCallingInConstructor {
    private int age;
    public ClassCallingInConstructor() {
        this("10");
    }
    public ClassCallingInConstructor(String age) {
        setAge(age);
    }

    public void setAge(@NotNull String age) {
        this.age = Integer.parseInt(age);
    }
}
