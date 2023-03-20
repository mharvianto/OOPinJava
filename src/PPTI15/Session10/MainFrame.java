package PPTI15.Session10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MainFrame extends JFrame implements ActionListener {
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
    JMenuItem loginMenuItem = new JMenuItem("Login");

    JDesktopPane desktopPane = new JDesktopPane();

    public MainFrame() {
        menuBar.add(fileMenu);
        fileMenu.add(loginMenuItem);
        fileMenu.add(new JMenuItem("Logout"));
//        fileMenu.add(new JSeparator());
        String menu[] = {"Copy", "Paste"};
        for (String item : menu) {
            JMenuItem menuItem = new JMenuItem(item);
            menuItem.addActionListener(this);
            fileMenu.add(menuItem);
        }
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        loginMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
        setJMenuBar(menuBar);

        setContentPane(desktopPane);

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }

    JInternalFrame frame = null;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
//            dispose();
            System.exit(0);
        }
        if (e.getSource() instanceof JMenuItem menu) {
            if (menu.getText().equals("Login")) {
//                JFrame frame = new JFrame("Login");
//                frame.setVisible(true);
//                frame.setSize(200, 200);
//                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                if (frame == null || frame.isClosed()) {
                    frame = new JInternalFrame("Login", true,
                            true, true, true);
                    Vector<String> header = new Vector<>();
                    header.add("Student ID");
                    header.add("Name");
                    header.add("Score");

                    Vector<Vector<String>> data = new Vector<>();
                    Vector<String> row = new Vector<>();
                    row.add("12345");
                    row.add("Budi");
                    row.add("90");
                    data.add(row);
                    row = new Vector<>();
                    row.add("12346");
                    row.add("Kevin");
                    row.add("50");
                    data.add(row);

                    DefaultTableModel dtm = new DefaultTableModel(data, header);
                    JTable table = new JTable(dtm);
                    frame.add(table);
                    desktopPane.add(frame);
                }
                frame.setVisible(true);
                frame.setBounds(50, 50, 300, 300);
            }
        }
    }
}
