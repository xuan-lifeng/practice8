package org.example;

import java.time.LocalDate;

public class CO2Reading extends SensorReading {

    private int ppm;

    public CO2Reading(int ppm, LocalDate date) {
        super(date);
        this.ppm = ppm;
    }

    public int getPpm() {
        return ppm;
    }

    @Override
    public String getSummaryForDashboard() {
        return "CO₂: " + ppm + " ppm (" + getDate() + ")";
    }

    @Override
    public String getSummaryForLog() {
        return "CO₂ = " + ppm + " ppm on " + getDate();
    }
}
