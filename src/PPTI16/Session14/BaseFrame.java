package PPTI16.Session14;

import javax.swing.*;
import java.awt.*;

public class BaseFrame extends JFrame {
    protected JLabel header = new JLabel("Jaya Baru");
    BaseFrame() {
        add(header, BorderLayout.NORTH);
    }
}

class MainFrame extends BaseFrame
{
    JButton btn = new JButton("click");
    public MainFrame() {
        add(btn);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
