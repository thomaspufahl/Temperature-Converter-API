package com.temperature_converter.app.services;

import com.temperature_converter.app.models.Temperature;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    public void convertTemperature(Temperature temperature){

        switch (temperature.getType()) {
            case "fahrenheit", "FAHRENHEIT" -> {
                temperature.setType("FAHRENHEIT");
                temperature.setGrades(((temperature.getGrades() - 32) * 5 / 9));
            }
            case "celsius", "CELSIUS" -> {
                temperature.setType("FAHRENHEIT");
                temperature.setGrades((float) ((temperature.getGrades() * 1.8) + 32));
            }
            default -> {
                temperature.setType("INVALID_TYPE");
                temperature.setGrades(0);
            }
        }

    }
}
