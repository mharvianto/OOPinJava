package PPTI15.Session09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameFrame extends JFrame {
    private GamePanel panel = new GamePanel();

    public GameFrame() {
        add(panel);
        panel.setFocusable(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}

class GamePanel extends JPanel implements KeyListener {
    private int x = 100;
    private int y = 100;

    private Point ballPoint = new Point();
    private Point ballSpeed = new Point(3, 3);
    private Color ballColor = Color.BLACK;

    private Random rand = new Random();

    private Color randomColor() {
        return new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }

    private ActionListener ballAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (ballPoint.x + ballSpeed.x < 0 ||
                    ballPoint.x + ballSpeed.x + 20 > getWidth()) {
                ballSpeed.x *= -1;
                ballColor = randomColor();
            }
            if (ballPoint.y + ballSpeed.y < 0 ||
                    ballPoint.y + ballSpeed.y + 20 > getHeight()) {
                ballSpeed.y *= -1;
                ballColor = randomColor();
            }
            ballPoint.x += ballSpeed.x;
            ballPoint.y += ballSpeed.y;
            repaint();
        }
    };

    public final int FPS = 30;
    private Timer timer;

    public GamePanel() {
        addKeyListener(this);
        setDoubleBuffered(true);
        timer = new Timer(1000 / FPS, ballAction);
        timer.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y -= 20;
                break;
            case KeyEvent.VK_DOWN:
                y += 20;
                break;
            case KeyEvent.VK_RIGHT:
                x += 20;
                break;
            case KeyEvent.VK_LEFT:
                x -= 20;
                break;
        }
        System.out.println(e.getKeyCode());
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
        drawBall(g);
    }

    /**
     * Fungsi ini untuk mengambarkan bola pada frame.
     * @param g
     */
    private void drawBall(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(ballColor);
        g2d.fillOval(ballPoint.x, ballPoint.y, 20, 20);
    }

    void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillRect(x, y, 20, 20);
    }
}
