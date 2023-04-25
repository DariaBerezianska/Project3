package part3_1;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        //Box.createVerticalGlue()
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
        //Box.createHorizontalGlue()
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
        //Box.createRigidArea()
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        addLabel(panel3, "test3");
        panel3.add(Box.createRigidArea(new Dimension(20, 0)));
        addLabel(panel3, "test3");
        panel3.add(Box.createRigidArea(new Dimension(20, 0)));
        addLabel(panel3, "test3");
        panel3.add(Box.createRigidArea(new Dimension(20, 0)));
        addLabel(panel3, "test3");
        panel3.add(Box.createRigidArea(new Dimension(20, 0)));
        addLabel(panel3, "test3");
        panel3.add(Box.createRigidArea(new Dimension(20, 0)));

        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void addLabel(JPanel panel, String title) {
        JLabel label = new JLabel(title);
        panel.add(label);
    }
}
