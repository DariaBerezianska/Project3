package part3_1;

import javax.swing.*;

public class GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");
        frame.setLayout( new java.awt.GridLayout(3,2));
        addButton(frame, "drama");
        addButton(frame, "comedy");
        addButton(frame, "adventure");
        addButton(frame, "thriller");
        addButton(frame, "fantasy");
        addButton(frame, "mystery");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void addButton(JFrame frame, String title) {
        JButton button = new JButton(title);
        frame.add(button);
    }
}
