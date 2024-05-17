package com.example.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Valid
@Introspected
public class ColumnThresholdCreationDto {
	@Pattern(regexp = "[a-zA-Z]+")
	private final String column;
	private final ConstraintType constraintType;
	private final BigDecimal threshold;
}
