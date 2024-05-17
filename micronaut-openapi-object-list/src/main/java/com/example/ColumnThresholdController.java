package com.example;

import com.example.model.ColumnThresholdCreationDto;
import com.example.model.ColumnThresholdDto;
import com.example.model.ConstraintType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.validation.Validated;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Validated
@Controller
public class ColumnThresholdController implements RestaurantApi.ColumnThresholdApi {
	@Override
	public ColumnThresholdDto createColumnThreshold(int restaurantId, ColumnThresholdCreationDto dto) {
		return null;
	}

	@Override
	public List<ColumnThresholdDto> getColumnThresholds(int restaurantId) {
		return List.of();
	}

	@Override
	public List<String> getColumnThresholdColumns(int restaurantId) {
		return List.of();
	}

	@Override
	public ColumnThresholdDto getColumnThreshold(int restaurantId, String column) {
		return null;
	}

	@Override
	public void removeColumnThreshold(int restaurantId, String column) {

	}

	@Override
	public ColumnThresholdDto updateColumnThreshold(int restaurantId, String column, Optional<ConstraintType> newConstraintType, Optional<BigDecimal> newThreshold) {
		return null;
	}
}
