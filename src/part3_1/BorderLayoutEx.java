package part3_1;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        frame.setLayout(new BorderLayout());
        addLabel(frame, "north", "north");
        addLabel(frame, "south", "south");
        addLabel(frame, "east", "east");
        addLabel(frame, "west", "west");
        addLabel(frame, "center", "center");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void addLabel(JFrame frame, String title, String where) {
        JLabel label = new JLabel(title);
        label.setHorizontalAlignment(JLabel.CENTER);
        if (where.toLowerCase().equals("north")) {
            frame.add(label, java.awt.BorderLayout.NORTH);
        } else if (where.toLowerCase().equals("south")) {
            frame.add(label, java.awt.BorderLayout.SOUTH);
        } else if (where.toLowerCase().equals("east")) {
            frame.add(label, java.awt.BorderLayout.EAST);
        } else if (where.toLowerCase().equals("west")) {
            frame.add(label, java.awt.BorderLayout.WEST);
        } else {
            frame.add(label, java.awt.BorderLayout.CENTER);
        }
    }
}
