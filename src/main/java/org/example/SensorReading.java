package org.example;

import javax.swing.*;
import java.time.LocalDate;

public abstract class SensorReading {
    private LocalDate date;

    public SensorReading(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    // For homeowner dashboard (short text / label content)
    public abstract String getSummaryForDashboard();

    // For technician log (detailed string)
    public abstract String getSummaryForLog();

    // Optional: a small Swing component for the dashboard
    public JComponent getDashboardComponent() {
        return new JLabel(getSummaryForDashboard());
    }
}
