package part3_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Application {
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JLabel label;

    public void run() {
        JFrame frame = new JFrame("Application");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        label = new JLabel("Label");

        JButton b1 = new JButton("copy txt1 to txt2");
        JButton b2 = new JButton("copy label to txt3");
        JButton b3 = new JButton("copy txt3 to txt1");
        JButton b4 = new JButton("reset");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.setText(t1.getText());
                JOptionPane.showMessageDialog(null, "text copied from TextField1 to TextField2");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t3.setText(label.getText());
                JOptionPane.showMessageDialog(null, "text copied from Label to TextField3");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText(t3.getText());
                JOptionPane.showMessageDialog(null, "text copied from TextField3 to TextField1");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to reset the program?") == JOptionPane.YES_OPTION) {
                    reset();
                    JOptionPane.showMessageDialog(null, "All data reset");
                }

            }
        });
        t2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    label.setText(t2.getText());
                }
                JOptionPane.showMessageDialog(null, "text copied from TextField2 to Label");
                if (JOptionPane.showConfirmDialog(null, "Do you want to change the title of Label?") == JOptionPane.YES_OPTION) {
                    label.setText(JOptionPane.showInputDialog(null, "Enter the new tittle for Label: "));
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("text field 1:"));
        panel.add(t1);
        panel.add(new JLabel("text field 2:"));
        panel.add(t2);
        panel.add(new JLabel("text field 3:"));
        panel.add(t3);
        panel.add(new JLabel("label:"));
        panel.add(label);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 250);
        frame.setVisible(true);

    }

    public void reset() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        label.setText("");
    }

    public static void main(String[] args) {
        new Application().run();
    }

}
