package com.example.onepipe.challenge.serviceImpl;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
public class Rain {
    @XmlElement(name = "1h")
    private double oneHour;
}
