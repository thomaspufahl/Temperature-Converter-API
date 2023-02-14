package com.temperature_converter.app.controllers;

import com.temperature_converter.app.models.Temperature;
import com.temperature_converter.app.services.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    @Autowired
    private ConverterService converterService;

    @GetMapping("/")
    public String welcomeToMyAppMessage() {
        System.out.println("welcome to my app console");
        return "Welcome to my app";
    }

    @GetMapping("/temperature_converter")
    public Temperature getTemperature(@RequestParam() String type, @RequestParam float grades) {
        Temperature temperature = new Temperature(type, grades);
        converterService.convertTemperature(temperature);
        return temperature;

    }
}
