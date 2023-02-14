package com.temperature_converter.app.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Temperature {
    private String type;
    private float grades;

    public Temperature(String type, float grades) {
        this.type = type;
        this.grades = grades;
    }
}
