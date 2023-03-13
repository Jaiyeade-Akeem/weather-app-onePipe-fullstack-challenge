package com.example.onepipe.challenge.controller;

import com.example.onepipe.challenge.serviceImpl.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@RequestMapping("/city")
public class WeatherController {
    @Autowired
    private WeatherServiceImpl weatherService;
    @GetMapping( "/{cityName}")
    ResponseEntity<?> getWeatherDat(@PathVariable String cityName) throws JAXBException, IOException {
            return weatherService.getWeatherDataByCityName(cityName);
    }

}

