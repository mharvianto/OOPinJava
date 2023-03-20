package PPTI16.Session10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MainFrame extends JFrame implements ActionListener {
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem loginMenuItem = new JMenuItem("Login");
    JMenuItem exitMenuItem = new JMenuItem("Exit");

    JDesktopPane desktopPane = new JDesktopPane();

    public MainFrame() {
        menuBar.add(fileMenu);
        fileMenu.add(loginMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        loginMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
        setJMenuBar(menuBar);

        setContentPane(desktopPane);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
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
//                JFrame frame = new JFrame("Login Frame");
//                frame.setVisible(true);
//                frame.setSize(200, 200);
//                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                if (frame == null || frame.isClosed()) {
                    frame = new JInternalFrame("Internal", true,
                            true, true, true);
                    Vector<String> header = new Vector<>();
                    header.add("Name");
                    header.add("Score");
                    Vector<Vector<String>> data = new Vector<>();
                    Vector<String> row = new Vector<>();
                    row.add("Budi");
                    row.add("90");
                    data.add(row);
                    row = new Vector<>();
                    row.add("Agus");
                    row.add("75");
                    data.add(row);
                    DefaultTableModel dtm = new DefaultTableModel(data, header);
                    frame.add(new JTable(dtm));
                    desktopPane.add(frame);
                }
                frame.setVisible(true);
                frame.setBounds(50, 50, 200, 200);
            }
        }
    }
}
