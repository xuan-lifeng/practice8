package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class HomeownerDashboard extends JPanel {

    public HomeownerDashboard(List<Room> rooms) {
        setLayout(new GridLayout(rooms.size(), 1, 5, 5));

        for (Room room : rooms) {
            add(new RoomPanel(room));
        }
    }
}
