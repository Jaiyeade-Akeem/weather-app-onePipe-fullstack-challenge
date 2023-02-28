package com.example.onepipe.challenge.serviceImpl;

import com.example.onepipe.challenge.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private OpenWeatherMapServiceImpl openWeatherMapService;
    @Override
    public ResponseEntity<String> getWeatherDataByCityName(String city) {
        return openWeatherMapService.getWeatherData(city);
    }

    @Override
    public ResponseEntity<String> getWeatherDescriptionByCityName(String city) {
        return openWeatherMapService.getWeatherDescription(city);
    }
}
