package com.example.model;

import io.micronaut.core.annotation.Introspected;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;

@Valid
@Introspected
@EqualsAndHashCode(callSuper = true)
@ToString
public class ColumnThresholdDto extends ColumnThresholdCreationDto {
    public ColumnThresholdDto(
            @Pattern(regexp = "[a-zA-Z]+") String column,
            ConstraintType constraintType,
            BigDecimal threshold
    ) {
        super(column, constraintType, threshold);
    }
}
