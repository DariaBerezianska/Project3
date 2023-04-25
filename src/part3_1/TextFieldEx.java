package part3_1;

import javax.swing.*;
import java.awt.FlowLayout;

public class TextFieldEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField");
        frame.setLayout(new FlowLayout());
        addTextField(frame, "name: ");
        addTextField(frame, "surname: ");
        addTextField(frame, "phone number: ");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void addTextField(JFrame frame, String title) {
        JTextField textField = new JTextField(40);
        frame.add(new JLabel(title));
        frame.add(textField);
    }
}
