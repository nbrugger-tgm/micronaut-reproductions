package com.example.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;

import java.util.List;


@Introspected
@Valid
@Getter
public class RestaurantDto extends RestaurantCreationDto {
	@NotNull
	private final List<@Email String> employees;

	private final List<ColumnThresholdDto> columnThresholds;

	public RestaurantDto(
		int id,
		@NotNull @Max(250) @Min(3) String name,
		String location
	) {
		this(id, name, location, List.of(), List.of());
	}

	public RestaurantDto(
		int id,
		@NotNull @Max(250) @Min(3) String name,
		String location,
		List<String> employees,
		List<ColumnThresholdDto> columnThresholds
	) {
		super(id, name, location);
		this.employees = employees;
		this.columnThresholds = columnThresholds;
	}
}
