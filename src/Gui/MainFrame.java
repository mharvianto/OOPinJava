package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener
{
    private JMenuBar menuBar = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem loginMenuItem = new JMenuItem("Login");
    private JMenuItem logoutMenuItem = new JMenuItem("Logout");
    private JMenuItem exitMenuItem = new JMenuItem("Exit");
    private JMenu masterMenu = new JMenu("Master");
    private JMenuItem productMenuItem = new JMenuItem("Product");

    private JDesktopPane desktopPane = new JDesktopPane();

    MainFrame() {
        fileMenu.add(loginMenuItem);
        fileMenu.add(logoutMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        masterMenu.add(productMenuItem);

        loginMenuItem.addActionListener(this);
        logoutMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
        productMenuItem.addActionListener(this);

        logout();

        menuBar.add(fileMenu);
        menuBar.add(masterMenu);
        setJMenuBar(menuBar);

        setContentPane(desktopPane);

        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        try {
            for(var item :UIManager.getInstalledLookAndFeels()){
                System.out.println(item.getName() + " " + item.getClassName());
            }
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("Look and feel not found");
        }
        new MainFrame();
    }

    private String email = null;

    public String getEmail() {
        return email;
    }

    public void login(String email) {
        this.email = email;
        loginMenuItem.setVisible(false);
        logoutMenuItem.setVisible(true);
    }

    public void logout() {
        this.email = null;
        loginMenuItem.setVisible(true);
        logoutMenuItem.setVisible(false);
    }

    private LoginFrame loginFrame = null;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitMenuItem) {
            System.exit(0);
        } else if(e.getSource() == loginMenuItem) {
            if(loginFrame == null || loginFrame.isClosed()) {
                loginFrame = new LoginFrame();
                loginFrame.setParent(this);
                desktopPane.add(loginFrame);
            }
        } else if(e.getSource() == logoutMenuItem) {
            logout();
            JOptionPane.showMessageDialog(this, "Success logout!");
        }
    }
}
