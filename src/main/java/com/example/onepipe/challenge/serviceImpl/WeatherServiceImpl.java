package com.example.onepipe.challenge.serviceImpl;

import com.example.onepipe.challenge.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private OpenWeatherMapServiceImpl openWeatherMapService;
    @Override
    public ResponseEntity<?> getWeatherDataByCityName(String city) throws IOException, JAXBException {
        return openWeatherMapService.getWeatherData(city);
    }

}
