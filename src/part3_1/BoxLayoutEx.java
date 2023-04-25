package part3_1;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout");
        JPanel panel =  new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        addLabel(panel1, "test");
        panel1.add(Box.createVerticalGlue());
        addLabel(panel1, "test");
        panel1.add(Box.createVerticalGlue());
        addLabel(panel1, "test");
        panel1.add(Box.createVerticalGlue());
        addLabel(panel1, "test");
        panel1.add(Box.createVerticalGlue());
        addLabel(panel1, "test");
        panel1.add(Box.createVerticalGlue());
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        addLabel(panel2, "another test");
        panel2.add(Box.createHorizontalGlue());
        addLabel(panel2, "another test");
        panel2.add(Box.createHorizontalGlue());
        addLabel(panel2, "another test");
        panel2.add(Box.createHorizontalGlue());
        addLabel(panel2, "another test");
        panel2.add(Box.createHorizontalGlue());
        addLabel(panel2, "another test");
        panel2.add(Box.createHorizontalGlue());
        frame.setVisible(true);
        frame.setSize(500, 300);
        panel.add(panel1);
        panel.add(panel2);
        frame.add(panel);

    }

    public static void addLabel(JPanel panel, String title) {
        JLabel label = new JLabel(title);
        panel.add(label);
    }
}
//        frame.setLayout(new javax.swing.BoxLayout(frame.getContentPane(), javax.swing.BoxLayout.Y_AXIS));
//        addButton(frame, "Beginner");
//        frame.add(Box.createVerticalGlue());
//        addButton(frame, "Intermediate");
//        frame.add(Box.createVerticalGlue());
//        addButton(frame, "Upper-Intermediate");
//        frame.add(Box.createVerticalGlue());
//        addButton(frame, "Advanced");
//        frame.add(Box.createVerticalGlue());
//        addButton(frame, "Mastery");
//        frame.setSize(500, 500);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
