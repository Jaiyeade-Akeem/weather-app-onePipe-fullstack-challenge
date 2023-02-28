package com.example.onepipe.challenge.controller;

import com.example.onepipe.challenge.serviceImpl.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:63342", "http://localhost:8080"})
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherServiceImpl weatherService;
    @GetMapping(name = "/getCityWeatherData", produces = MediaType.APPLICATION_XML_VALUE)
    ResponseEntity<String> getWeatherDat(@RequestParam String city){
        return weatherService.getWeatherDataByCityName(city);
    }
    @GetMapping("/getCityWeatherDescription")
    ResponseEntity<String> getDesc(@RequestParam String city){
        return weatherService.getWeatherDescriptionByCityName(city);
    }



}

