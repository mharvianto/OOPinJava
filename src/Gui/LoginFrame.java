package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JInternalFrame implements ActionListener
{
    private JLabel headerLabel = new JLabel("Login");
    private JPanel centerPanel = new JPanel(new GridLayout(2, 2));
    private JTextField emailField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JPanel southPanel = new JPanel();
    private JButton loginButton = new JButton("Login");

    public LoginFrame() {
        super("", false, true);
        setLayout(new BorderLayout());
        add(headerLabel, BorderLayout.NORTH);
        add(centerPanel);
        add(southPanel, BorderLayout.SOUTH);

        headerLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        centerPanel.add(new JLabel("Email:"));
        centerPanel.add(emailField);
        centerPanel.add(new JLabel("Password:"));
        centerPanel.add(passwordField);

        loginButton.addActionListener(this);

        southPanel.add(loginButton);
        setVisible(true);
        setBounds(10, 10, 300, 170);
    }

    private JFrame parent = null;

    public void setParent(JFrame parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(emailField.getText().isBlank() || new String(passwordField.getPassword()).isBlank()) {
            JOptionPane.showMessageDialog(this, "Please fill the field!");
        } else {
            if (emailField.getText().equals("admin") && new String(passwordField.getPassword()).equals("admin")) {
                JOptionPane.showMessageDialog(this, "Success to login!");
                if (parent instanceof MainFrame frame) {
                    frame.login(emailField.getText());
                }
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Email or Password invalid");
            }
        }
    }
}
