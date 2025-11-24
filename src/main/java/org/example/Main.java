package org.example;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            // ----- Create rooms and readings -----

            List<Room> rooms = new ArrayList<>();

            Room livingRoom = new Room(
                    "Living Room",
                    1,
                    "https://example.com/livingroom.jpg"
            );
            livingRoom.addReading(new TemperatureReading(22.4, LocalDate.of(2024, 11, 14)));
            livingRoom.addReading(new HumidityReading(46, LocalDate.of(2024, 11, 14)));
            livingRoom.addReading(new CO2Reading(720, LocalDate.of(2024, 11, 14)));
            rooms.add(livingRoom);

            Room bedroom = new Room(
                    "Bedroom",
                    2,
                    "https://example.com/bedroom.jpg"
            );
            bedroom.addReading(new TemperatureReading(20.1, LocalDate.of(2024, 11, 15)));
            bedroom.addReading(new HumidityReading(50, LocalDate.of(2024, 11, 15)));
            bedroom.addReading(new CO2Reading(800, LocalDate.of(2024, 11, 15)));
            rooms.add(bedroom);

            // ----- Build GUI -----

            JFrame frame = new JFrame("Smart Home Environmental Monitoring");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 600);
            frame.setLayout(new BorderLayout());

            JTabbedPane tabs = new JTabbedPane();
            tabs.addTab("Homeowner Dashboard", new HomeownerDashboard(rooms));
            tabs.addTab("Technician Log", new TechnicianLogPanel(rooms));

            frame.add(tabs, BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
