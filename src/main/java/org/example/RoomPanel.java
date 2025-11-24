package org.example;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class RoomPanel extends JPanel {

    public RoomPanel(Room room) {
        setLayout(new BorderLayout(10, 10));
        setBorder(new TitledBorder(room.getName() + " (Floor " + room.getFloor() + ")"));

        // Left: image
        JLabel imageLabel = room.getImageLabel();
        add(imageLabel, BorderLayout.WEST);

        // Right: room details + readings
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JLabel infoLabel = new JLabel("<html>"
                + "Room: " + room.getName() + "<br>"
                + "Floor: " + room.getFloor()
                + "</html>");
        rightPanel.add(infoLabel);
        rightPanel.add(Box.createVerticalStrut(10));

        // Add readings (polymorphism used to format summary)
        for (SensorReading reading : room.getReadings()) {
            rightPanel.add(reading.getDashboardComponent());
        }

        add(rightPanel, BorderLayout.CENTER);
    }
}
