package com.example;

import jakarta.validation.constraints.NotNull;

public class BeanThatShouldHaveInterceptor {
    public void setAge(@NotNull String age) {}
}
