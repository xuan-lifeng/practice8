package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TechnicianLogPanel extends JPanel {

    public TechnicianLogPanel(List<Room> rooms) {
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        StringBuilder logBuilder = new StringBuilder();

        for (Room room : rooms) {
            for (SensorReading reading : room.getReadings()) {
                String line = "Room: " + room.getName() + " (Floor " + room.getFloor() + ") - "
                        + reading.getSummaryForLog();
                logBuilder.append(line).append("\n");
            }
        }

        String logText = logBuilder.toString();
        textArea.setText(logText);

        // print to console too, as per requirement
        System.out.println(logText);

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
}
