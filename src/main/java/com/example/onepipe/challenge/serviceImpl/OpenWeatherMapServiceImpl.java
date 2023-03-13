package com.example.onepipe.challenge.serviceImpl;

import com.example.onepipe.challenge.service.OpenWeatherMapService;
import com.example.onepipe.challenge.utils.OpenWeatherMapUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.StringReader;


@Service
public class OpenWeatherMapServiceImpl implements OpenWeatherMapService {
    @Override
    public ResponseEntity<?> getWeatherData(String city) throws IOException, JAXBException {
        String url = String.format(OpenWeatherMapUtil.GET_WEATHER_DATA, city, OpenWeatherMapUtil.API_KEY);
        RestTemplate restTemplate = new RestTemplate();
        WeatherResponseDTO1 responseDTO1 = restTemplate.getForObject(url, WeatherResponseDTO1.class);
        return  ResponseEntity.ok(responseDTO1);

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
