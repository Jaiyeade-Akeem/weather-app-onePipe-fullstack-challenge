package com.example.onepipe.challenge.service;

import org.springframework.http.ResponseEntity;

public interface WeatherService {
    ResponseEntity<String > getWeatherDataByCityName(String city);
    ResponseEntity<String > getWeatherDescriptionByCityName(String city);
}
