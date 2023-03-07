package PPTI16.Session09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GambarFrame extends JFrame {

    DrawPanel panel = new DrawPanel();
    GambarFrame() {
        add(panel);
        panel.revalidate();
        panel.requestFocus();
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(100, 100, 20, 20);
    }

    public static void main(String[] args) {
        new GambarFrame();
    }
}

class DrawPanel extends JPanel implements KeyListener
{
    DrawPanel() {
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    int x = 2;
    int y = 2;

    void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x * 20, y * 20, 20, 20);
        g2d.fillRect(x * 20, y * 20, 20, 20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y++; break;
        }
        System.out.println("asd");
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
