package PPTI16.Session08;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ini Frame");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4, 3));
        JButton btn = new JButton("Click me!");
        centerPanel.add(btn);
        JButton btn1 = new JButton("Click me!");
        centerPanel.add(btn1);
        for (int i = 0; i < 10; i++) {
            centerPanel.add(new JButton("Button " + i));
        }
        frame.add(centerPanel);

        JLabel label = new JLabel("ini Label");
        frame.add(label, BorderLayout.NORTH);

        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
