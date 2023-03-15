package com.example.onepipe.challenge.service;

import org.springframework.http.ResponseEntity;
import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface WeatherService {
    ResponseEntity<?> getWeatherDataByCityName(String city) throws IOException, JAXBException;
}
