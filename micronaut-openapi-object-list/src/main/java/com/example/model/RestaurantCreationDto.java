package com.example.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Introspected
@Valid
@Data
public class RestaurantCreationDto {
	private final int id;
	@NotNull
	@Pattern(regexp = "[a-zA-Z]+")
	private final String name;
	@NotNull
	@Pattern(regexp = "[a-zA-Z]+")
	private final String location;
}
