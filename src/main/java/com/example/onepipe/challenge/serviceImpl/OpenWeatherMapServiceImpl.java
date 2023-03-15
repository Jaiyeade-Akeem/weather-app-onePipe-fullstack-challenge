package com.example.onepipe.challenge.serviceImpl;

import com.example.onepipe.challenge.service.OpenWeatherMapService;
import com.example.onepipe.challenge.utils.OpenWeatherMapUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;




@Service
public class OpenWeatherMapServiceImpl implements OpenWeatherMapService {
    @Override
    public ResponseEntity<?> getWeatherData(String city) {
        String url = String.format(OpenWeatherMapUtil.GET_WEATHER_DATA, city, OpenWeatherMapUtil.API_KEY);
        RestTemplate restTemplate = new RestTemplate();
        WeatherResponse responseDTO1 = restTemplate.getForObject(url, WeatherResponse.class);
        return  ResponseEntity.ok(responseDTO1);

    }

}
