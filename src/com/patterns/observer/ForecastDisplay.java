package com.patterns.observer;

/**
 * Created by karenvega on 14/09/16.
 */
public class ForecastDisplay implements DisplayElement {

    private WeatherData weatherData;

    public ForecastDisplay (WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {

    }
}
