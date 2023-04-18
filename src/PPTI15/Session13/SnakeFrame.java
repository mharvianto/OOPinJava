package PPTI15.Session13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class SnakeFrame extends JFrame
{
    public SnakeFrame() {
        add(new SnakePanel());
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SnakeFrame();
    }
}

class SnakePanel extends JPanel implements KeyListener
{
    private final Point head = new Point(10, 10);
    private final java.util.Queue<Point> q = new ArrayDeque<>();
    private final ArrayList<Point> apples = new ArrayList<>();
    private final int SIZE = 10;
    private int cooldown = 1;

    public SnakePanel() {
        addKeyListener(this);
        setFocusable(true);
        setDoubleBuffered(true);

        for (int i = 0; i < 20; i++) {
            q.add(new Point(10, 10 - i + 5));
            head.setLocation(10, 10 - i + 5);
        }

        Timer t = new Timer(1000/30, (e) -> { // fps
            refresh();
        });
        t.start();
    }

    private Random rand = new Random();

    public Point randomPoint() {
        return new Point(rand.nextInt(getWidth() / SIZE), rand.nextInt(getHeight() / SIZE));
    }

    private Direction move = Direction.UP;

    void refresh() {
        cooldown++;
        cooldown %= 30 * 5;
        if(cooldown == 0){
            Point p1;
            boolean check;
            do {
                check = false;
                p1 = randomPoint();
                for (Point p: q){
                    if (p1.x == p.x && p1.y == p.y) {
                        check = true;
                        break;
                    }
                }
            } while(check);
            apples.add(p1);
        }
        q.poll();
        switch (move) {
            case UP -> --head.y;
            case DOWN -> ++head.y;
            case LEFT -> --head.x;
            case RIGHT -> ++head.x;
        }
        q.add(new Point(head.x, head.y));
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        for (var apple: apples) {
            g2d.fillOval(apple.x * SIZE, apple.y * SIZE, SIZE, SIZE);
        }
        g2d.setColor(Color.BLACK);
        for (Point p: q) {
            g2d.fillRect(p.x * SIZE, p.y * SIZE, SIZE, SIZE);
        }
        g2d.fillRect(head.x * SIZE - 2, head.y * SIZE - 2, SIZE + 4, SIZE + 4);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (move == Direction.UP || move == Direction.DOWN) {
            switch(key) {
                case KeyEvent.VK_LEFT -> move = Direction.LEFT;
                case KeyEvent.VK_RIGHT -> move = Direction.RIGHT;
            }
        } else if (move == Direction.LEFT || move == Direction.RIGHT) {
            switch(key) {
                case KeyEvent.VK_UP -> move = Direction.UP;
                case KeyEvent.VK_DOWN -> move = Direction.DOWN;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

enum Direction
{
    UP,
    RIGHT,
    DOWN,
    LEFT,
}