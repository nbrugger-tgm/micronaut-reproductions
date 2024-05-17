package com.example;

import com.example.model.RestaurantCreationDto;
import com.example.model.RestaurantDto;
import io.micronaut.http.annotation.Controller;
import io.micronaut.validation.Validated;
import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Singleton
@Controller
@Validated
public class RestaurantController implements RestaurantApi {
    @Override
    public RestaurantDto createRestaurant(RestaurantCreationDto dto) {
        return null;
    }

    @Override
    public List<RestaurantDto> getRestaurants() {
        return List.of();
    }

    @Override
    public List<Integer> getRestaurantIds() {
        return List.of();
    }

    @Override
    public RestaurantDto getRestaurant(int id) {
        return null;
    }

    @Override
    public void removeRestaurant(int id) {

    }

    @Override
    public RestaurantDto updateRestaurant(int id, Optional<String> newLocation, Optional<String> newName) {
        return null;
    }
    @AllArgsConstructor
    @Singleton
    @Controller
    @Validated
    public static class EmployeeController implements EmployeeApi {

        @Override
        public List<String> getRestaurantEmployeeEmails(int restaurantId) {
            return List.of();
        }

        @Override
        public void setRestaurantEmployeeEmails(int restaurantId, List<String> employees) {

        }

        @Override
        public void addRestaurantEmployee(int restaurantId, String newEntry) {

        }

        @Override
        public void removeRestaurantEmployee(int restaurantId, String entryToRemove) {

        }
    }
}
