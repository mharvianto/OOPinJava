package PPTI16.Session09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener, WindowListener, MouseListener, MouseMotionListener {
    public static void main(String[] args) {
        new MainFrame();
    }

    private JButton btn = new JButton("Click me!");
    private JButton btn2 = new JButton("Footer");
    private JButton btn3 = new JButton("Header");

    private int count = 0;
    private ActionListener actionBtn3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
//            JOptionPane.showMessageDialog(null, "ini Header");
            count++;
            btn3.setText("Header " + count);
        }
    };

    public MainFrame() {
        btn.addActionListener(this);
        btn.addMouseMotionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(actionBtn3);
        add(btn);
        add(btn2, BorderLayout.SOUTH);
        add(btn3, BorderLayout.NORTH);

        addWindowListener(this);

        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click");
        if (e.getSource() == btn) {
            JOptionPane.showMessageDialog(null, "Hello world!");
            int res = JOptionPane.showConfirmDialog(null, "Yakin kah?");
            String result = JOptionPane.showInputDialog("Masukan nama");
            System.out.println("Nama: " + result + "\nButton: " + res);
        } else if (e.getSource() == btn2) {
            JOptionPane.showMessageDialog(this, "Ini Footer");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window deactivated");
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
}
