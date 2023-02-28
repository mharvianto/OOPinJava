package PPTI15.Session08;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame
{
    private JLabel headerLabel = new JLabel("Login");

    private JPanel centerPanel = new JPanel(new GridLayout(2, 2));
    private JLabel emailLabel = new JLabel("Email");
    private JLabel passwordLabel = new JLabel("Password");
    private JTextField emailField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();


    private JPanel footerPanel = new JPanel();
    private JButton submitBtn = new JButton("Submit");

    public LoginFrame(){
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(headerLabel, BorderLayout.NORTH);

        centerPanel.add(emailLabel);
        centerPanel.add(emailField);
        centerPanel.add(passwordLabel);
        centerPanel.add(passwordField);
        add(centerPanel);

        footerPanel.add(submitBtn);
        add(footerPanel, BorderLayout.SOUTH);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
