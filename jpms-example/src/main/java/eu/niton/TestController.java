package eu.niton;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.serde.annotation.Serdeable;
import io.micronaut.serde.config.annotation.SerdeConfig;

@Controller
public class TestController {
    @Get("/")
    public HelloWorld test() {
        return new HelloWorld(
                "Hello World!",
                "HelloWorld"
        );
    }

    @Serdeable
    public record HelloWorld(
            String displayMessage,
            String messageId
    ) {
    }
}
