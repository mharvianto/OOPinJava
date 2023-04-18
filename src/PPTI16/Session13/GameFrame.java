package PPTI16.Session13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GameFrame extends JFrame
{
    public GameFrame(){
        add(new GamePanel());
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}

class GamePanel extends JPanel implements KeyListener
{
    Point point = new Point(10, 10);
    public GamePanel() {
        setFocusable(true);
        addKeyListener(this);
        requestFocus();

        Timer t = new Timer(1000/10, (e) -> {
           reload();
        });
        t.start();
    }

    void reload() {
        switch (move) {
            case KeyEvent.VK_UP: --point.y; break;
            case KeyEvent.VK_DOWN: ++point.y; break;
            case KeyEvent.VK_LEFT: --point.x; break;
            case KeyEvent.VK_RIGHT: ++point.x; break;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillRect(point.x * 20, point.y * 20, 20, 20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    int move = KeyEvent.VK_UP;

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP ||
                e.getKeyCode() == KeyEvent.VK_DOWN ||
                e.getKeyCode() == KeyEvent.VK_LEFT ||
                e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            move = e.getKeyCode();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}