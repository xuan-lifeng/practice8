package org.example;

import java.time.LocalDate;

public class TemperatureReading extends SensorReading {

    private double temperatureC;

    public TemperatureReading(double temperatureC, LocalDate date) {
        super(date);
        this.temperatureC = temperatureC;
    }

    public double getTemperatureC() {
        return temperatureC;
    }

    @Override
    public String getSummaryForDashboard() {
        return "Temperature: " + temperatureC + " °C (" + getDate() + ")";
    }

    @Override
    public String getSummaryForLog() {
        return "Temperature = " + temperatureC + " °C on " + getDate();
    }
}
