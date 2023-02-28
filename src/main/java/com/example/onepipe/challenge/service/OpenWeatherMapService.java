package com.example.onepipe.challenge.service;

import org.springframework.http.ResponseEntity;

public interface OpenWeatherMapService {
    ResponseEntity<String> getWeatherData(String city);
    ResponseEntity<String> getWeatherDescription(String city);
}
