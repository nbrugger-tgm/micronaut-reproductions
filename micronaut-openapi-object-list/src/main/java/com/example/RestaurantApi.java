package com.example;

import com.example.model.*;
import io.micronaut.http.annotation.*;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@Tag(
    name = "Restaurant"
)
@Validated
public interface RestaurantApi {
  @Put("/restaurants")
  @Operation(
      security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
  )
  RestaurantDto createRestaurant(@Body @Valid RestaurantCreationDto dto);

  @Operation(
      security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
  )
  @Get("/restaurants")
  List<RestaurantDto> getRestaurants();

  @Operation(
      security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
  )
  @Get("/restaurants/_refs")
  List<Integer> getRestaurantIds();

  @Operation(
      security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
  )
  @Get("/restaurants/{id}")
  RestaurantDto getRestaurant(@PathVariable int id);

  @Operation(
      security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
  )
  @Delete("/restaurants/{id}")
  void removeRestaurant(@PathVariable int id);

  @Operation(
      security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
  )
  @Patch("/restaurants/{id}")
  RestaurantDto updateRestaurant(@PathVariable int id,
      @Pattern(regexp = "[a-zA-Z]+") @QueryValue Optional<String> newLocation,
      @Pattern(regexp = "[a-zA-Z]+") @QueryValue Optional<String> newName);


  @Tag(
      name = "RestaurantEmployee"
  )
  @Validated
  interface EmployeeApi {
    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    @Get("/restaurants/{restaurantId}/employees")
    List<String> getRestaurantEmployeeEmails(@PathVariable int restaurantId);

    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    @Patch("/restaurants/{restaurantId}/employees")
    void setRestaurantEmployeeEmails(@PathVariable int restaurantId, @Body List<String> employees);

    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    @Put("/restaurants/{restaurantId}/employees")
    void addRestaurantEmployee(@PathVariable int restaurantId, @QueryValue String newEntry);

    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    @Delete("/restaurants/{restaurantId}/employees/{entryToRemove}")
    void removeRestaurantEmployee(@PathVariable int restaurantId,
        @PathVariable String entryToRemove);
  }

  
  @Tag(
      name = "RestaurantColumnThresholds"
  )
  @Validated
  interface ColumnThresholdApi {
    @Put("/restaurants/{restaurantId}/columnThresholds")
    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    ColumnThresholdDto createColumnThreshold(@PathVariable int restaurantId,
                                             @Body @Valid ColumnThresholdCreationDto dto);

    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    @Get("/restaurants/{restaurantId}/columnThresholds")
    List<ColumnThresholdDto> getColumnThresholds(@PathVariable int restaurantId);

    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    @Get("/restaurants/{restaurantId}/columnThresholds/_refs")
    List<String> getColumnThresholdColumns(@PathVariable int restaurantId);

    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    @Get("/restaurants/{restaurantId}/columnThresholds/{column}")
    ColumnThresholdDto getColumnThreshold(@PathVariable int restaurantId,
        @Pattern(regexp = "[a-zA-Z]+") @PathVariable String column);

    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    @Delete("/restaurants/{restaurantId}/columnThresholds/{column}")
    void removeColumnThreshold(@PathVariable int restaurantId,
        @Pattern(regexp = "[a-zA-Z]+") @PathVariable String column);

    @Operation(
        security = @io.swagger.v3.oas.annotations.security.SecurityRequirement(scopes={}, name="identity-auth")
    )
    @Patch("/restaurants/{restaurantId}/columnThresholds/{column}")
    ColumnThresholdDto updateColumnThreshold(@PathVariable int restaurantId,
        @Pattern(regexp = "[a-zA-Z]+") @PathVariable String column,
        @QueryValue Optional<ConstraintType> newConstraintType,
        @QueryValue Optional<BigDecimal> newThreshold);
  }
}
