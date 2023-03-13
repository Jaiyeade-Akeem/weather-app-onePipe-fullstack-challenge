package com.example.onepipe.challenge.service;

import com.example.onepipe.challenge.serviceImpl.WeatherResponseDTO;
import com.example.onepipe.challenge.serviceImpl.WeatherResponseDTO1;
import org.springframework.http.ResponseEntity;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface WeatherService {
    ResponseEntity<?> getWeatherDataByCityName(String city) throws IOException, JAXBException;
    ResponseEntity<String > getWeatherDescriptionByCityName(String city);
}
