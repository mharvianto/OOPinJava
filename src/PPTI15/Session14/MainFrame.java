package PPTI15.Session14;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends BaseFrame
{
    MainFrame(){
        add(new MyButton("Btn1"));
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}

class MyButton extends JButton
{
    public MyButton (String text) {
        super(text);
        setBackground(Color.RED);
        setFont(new Font("Arial", Font.PLAIN, 40));
    }
}

class BaseFrame extends JFrame
{
    private JLabel header = new JLabel("Makmur Jaya");

    BaseFrame () {
        header.setHorizontalAlignment(SwingConstants.CENTER);
        add(header, BorderLayout.NORTH);

    }
}
