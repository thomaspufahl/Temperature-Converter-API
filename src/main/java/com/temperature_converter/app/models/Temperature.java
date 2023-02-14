package com.temperature_converter.app.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Temperature {
    private float grades;
    private TemperatureTypes type;

    public Temperature(float grades, TemperatureTypes type) {
        this.grades = grades;
        this.type = type;
    }
}
