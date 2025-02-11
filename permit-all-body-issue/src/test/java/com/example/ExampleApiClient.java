package com.example;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.context.scope.Refreshable;


@Client("/")
@Refreshable
public interface ExampleApiClient extends ExampleApi {
}
