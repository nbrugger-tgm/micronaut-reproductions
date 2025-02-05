package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.QueryValue;
import jakarta.annotation.security.PermitAll;

public interface ExampleApi {

    @Post("without-body")
    String withoutBody();

    @Post(consumes = MediaType.TEXT_PLAIN, value = "with-query")
    String withQuery(@QueryValue("HelloWorld") String query);

    @Post(consumes = MediaType.TEXT_PLAIN, value = "with-header")
    String withHeader(@Header("Hello-World") String header);

    @Post(consumes = MediaType.TEXT_PLAIN, value = "with-body")
    String withBody(@QueryValue(defaultValue = "null") String body);
}
