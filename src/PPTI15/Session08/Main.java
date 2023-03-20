package PPTI15.Session08;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        try {
            for (var item : UIManager.getInstalledLookAndFeels()) {
                System.out.println(item.getClassName());
            }
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
        JFrame frame = new JFrame("Ini frame!");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));
        JButton btn = new JButton("Click me!");
        panel.add(btn);
        JButton btn1 = new JButton("Click me!");
        panel.add(btn1);
        for (int i = 0; i < 10; i++) {
            panel.add(new JButton("Button " + i));
        }
        frame.add(panel);

        JLabel label = new JLabel("Ini Label");
        frame.add(label, BorderLayout.NORTH);

        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.SOUTH);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
