package com.example.onepipe.challenge.serviceImpl;

import lombok.Data;

@Data
public class WeatherDTO {
    private Integer id;
    private String main;
    private String description;
    private String icon;

    // getters and setters
}
