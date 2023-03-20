package PPTI15.Session09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener, WindowListener, MouseListener, MouseMotionListener {
    public static void main(String[] args) {
        new MainFrame();
    }

    private JButton btn = new JButton("Click me!");
    private JButton btn2 = new JButton("South");
    private JButton btn3 = new JButton("North");

    private int count = 0;

    private ActionListener actionBtn3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            btn3.setText("North " + count);
        }
    };

    public MainFrame() {
        btn.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(actionBtn3);
        add(btn);
        add(btn2, BorderLayout.SOUTH);
        add(btn3, BorderLayout.NORTH);

        btn.addMouseMotionListener(this);
        addWindowListener(this);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click");
        if (e.getSource() == btn) {
            JOptionPane.showMessageDialog(this, "Hello world!");
            String nama = JOptionPane.showInputDialog("Masukkan Nama:");
            System.out.println("Nama: " + nama);
            int result = JOptionPane.showConfirmDialog(this, "Yakin?");
            System.out.println("Button: " + result);
        } else if (e.getSource() == btn2) {
            JOptionPane.showMessageDialog(null, "Ini Footer");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("X: " + e.getX() + ", Y: " + e.getY());
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window Deactivated");
    }
}
