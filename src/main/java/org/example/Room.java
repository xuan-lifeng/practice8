package org.example;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private int floor;
    private String imageUrl; // HTTP URL string
    private List<SensorReading> readings = new ArrayList<>();

    public Room(String name, int floor, String imageUrl) {
        this.name = name;
        this.floor = floor;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public int getFloor() {
        return floor;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void addReading(SensorReading reading) {
        readings.add(reading);
    }

    public List<SensorReading> getReadings() {
        return readings;
    }

    /**
     * Returns a JLabel showing the room image (loaded from URL),
     * or a fallback label if it fails.
     */
    public JLabel getImageLabel() {
        try {
            URL url = new URL(imageUrl);
            ImageIcon icon = new ImageIcon(url);

            // optional: scale image to reasonable size
            java.awt.Image scaled = icon.getImage()
                    .getScaledInstance(250, -1, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaled);

            return new JLabel(icon);
        } catch (Exception e) {
            return new JLabel("Image unavailable");
        }
    }
}
