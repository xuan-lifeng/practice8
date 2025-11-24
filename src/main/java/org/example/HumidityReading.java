package org.example;

import java.time.LocalDate;

public class HumidityReading extends SensorReading {

    private double humidityPercent;

    public HumidityReading(double humidityPercent, LocalDate date) {
        super(date);
        this.humidityPercent = humidityPercent;
    }

    public double getHumidityPercent() {
        return humidityPercent;
    }

    @Override
    public String getSummaryForDashboard() {
        return "Humidity: " + humidityPercent + " % (" + getDate() + ")";
    }

    @Override
    public String getSummaryForLog() {
        return "Humidity = " + humidityPercent + " % on " + getDate();
    }
}
