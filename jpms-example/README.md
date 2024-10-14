## Micronaut 4.6.3 JPMS

This is a working example of using Micronaut 4.6.3 with Java 21 and JPMS.

> This example does **NOT** work for jlink generation since (as of this version) doesn't define its dependencies
> to other modules (`module-info.java` files).

### Run

- Run the application with `./gradlew run`
- `curl localhost:8080`