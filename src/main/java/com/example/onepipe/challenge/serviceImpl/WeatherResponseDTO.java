package com.example.onepipe.challenge.serviceImpl;

//import com.sun.tools.javac.Main;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "weather")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class WeatherResponseDTO {

    @XmlElement(name = "coord")
    private Coord coord;

    @XmlElement(name = "weather")
    private Weather weather;

    @XmlElement(name = "base")
    private String base;

    @XmlElement(name = "main")
    private Main main;

    @XmlElement(name = "visibility")
    private int visibility;

    @XmlElement(name = "wind")
    private Wind wind;

    @XmlElement(name = "rain")
    private Rain rain;

    @XmlElement(name = "clouds")
    private Clouds clouds;

    @XmlElement(name = "dt")
    private long dt;

    @XmlElement(name = "sys")
    private Sys sys;

    @XmlElement(name = "timezone")
    private int timezone;

    @XmlElement(name = "id")
    private int id;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "cod")
    private int cod;

    // getters and setters
    // ...
}

