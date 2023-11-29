package com.example.subpackage;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Inherited
@Retention(RUNTIME)
@MicronautTest(environments = "integration")
public @interface MetaAnnotationWithMicronautTest {
}
