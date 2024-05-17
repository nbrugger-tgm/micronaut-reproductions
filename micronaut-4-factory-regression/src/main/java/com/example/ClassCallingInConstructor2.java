package com.example;

import jakarta.inject.Singleton;
import jakarta.validation.constraints.NotNull;

@Singleton
public class ClassCallingInConstructor2 {
    private int age;
    public ClassCallingInConstructor2() {
        this("10");
    }
    public ClassCallingInConstructor2(String age) {
        setAge(age);
    }

    public void setAge(@NotNull String age) {
        this.age = Integer.parseInt(age);
    }
}
