package com.temperature_converter.app.services;

import com.temperature_converter.app.models.Temperature;
import com.temperature_converter.app.models.TemperatureTypes;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    public void convertTemperature(Temperature temperature){

        switch (temperature.getType()) {
            case fahrenheit, FAHRENHEIT -> {
                temperature.setType(TemperatureTypes.CELSIUS);
                temperature.setGrades(((temperature.getGrades() - 32) * 5 / 9));
            }
            case celsius, CELSIUS -> {
                temperature.setType(TemperatureTypes.FAHRENHEIT);
                temperature.setGrades((float) ((temperature.getGrades() * 1.8) + 32));
            }
        }

    }
}
