package org.example.patterns.observer;

public class WeatherTest {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(wd);

        wd.setMeasurements(90,40,459);
        wd.setMeasurements(74,50,450);
        wd.setMeasurements(52,30,462);
    }
}
