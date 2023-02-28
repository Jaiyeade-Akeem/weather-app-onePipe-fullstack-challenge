package com.example.onepipe.challenge.serviceImpl;

import com.example.onepipe.challenge.service.OpenWeatherMapService;
import com.example.onepipe.challenge.utils.OpenWeatherMapUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OpenWeatherMapServiceImpl implements OpenWeatherMapService {
    @Override
    public ResponseEntity<String> getWeatherData(String city) {
        String url = String.format(OpenWeatherMapUtil.GET_WEATHER_DATA, city, OpenWeatherMapUtil.API_KEY);
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<String> getWeatherDescription(String city) {
        String url = String.format(OpenWeatherMapUtil.GET_WEATHER_DATA, city, OpenWeatherMapUtil.API_KEY);
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        String description = response.split("\"description\":\"")[1].split("\",\"icon\"")[0];
        return ResponseEntity.ok(description);
    }
}
