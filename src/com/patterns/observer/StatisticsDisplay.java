package com.patterns.observer;

/**
 * Created by karenvega on 14/09/16.
 */
public class StatisticsDisplay implements  DisplayElement {

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {

    }
}
