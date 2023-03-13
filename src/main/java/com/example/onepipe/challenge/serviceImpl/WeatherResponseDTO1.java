package com.example.onepipe.challenge.serviceImpl;

import lombok.Data;
import java.util.List;
@Data
public class WeatherResponseDTO1 {

    private CoordinatesDTO coord;
    private List<WeatherDTO> weather;
    private String base;
    private MainWeatherDTO main;
    private Integer visibility;
    private WindDTO wind;
    private CloudsDTO clouds;
    private Long dt;
    private SysDTO sys;
    private Integer id;
    private String name;
    private Integer cod;

    // getters and setters
}

