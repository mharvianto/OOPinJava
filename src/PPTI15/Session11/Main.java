package PPTI15.Session11;

import java.util.Scanner;

public class Main implements Runnable
{
    public static void main(String[] args) {
//        BST<String> bst = new BST<>();
//        bst.push("Kevin");
//        bst.push("Budi");
//        bst.push("Ani");
//        bst.push("Tono");
//        bst.push("Jono");
//        bst.push("Tina");
//        bst.viewTree();
//        BST<Integer> numbers = new BST<>();
//        for (int i = 0; i < 10; i++) {
//            numbers.push((int)(Math.random() * 1000));
//        }
//        numbers.viewTree();
        new Main();
    }

    public Main() {
        Thread th = new Thread(this);
        Thread th1 = new Thread(this);
        th.start();
        th1.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        th.interrupt();
        sc.nextLine();
        th1.interrupt();
    }

    @Override
    public void run() {
        int id = (int) (Math.random() * 1000);
        int a = 0;
        while(true) {
            System.out.println(id + " Loop " + a++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            if (Thread.currentThread().isInterrupted()) {
                try {
                    Thread.currentThread().join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return;
            }
        }
    }
}

class BST<T>
{
    class Node
    {
        int key;
        T data;
        Node left, right;
        public Node(int key, T data) {
            this.key = key;
            this.data = data;
            left = right = null;
        }
    }

    private Node root;
    public BST() {
        root = null;
    }

    private Node push(Node curr, int key, T data) {
        if (curr == null) {
            return new Node(key, data);
        } else {
            if (key < curr.key) {
                curr.left = push(curr.left, key, data);
            } else {
                curr.right = push(curr.right, key, data);
            }
            return curr;
        }
    }

    public void push(T data) {
        root = push(root, (int)(Math.random() * 1000), data);
    }

    private void viewTree(Node curr, int level) {
        if (curr != null) {
            viewTree(curr.right, level + 1);
            for (int i = 0; i < level; i++) System.out.print("    ");
            System.out.println(curr.key + " " + curr.data);
            viewTree(curr.left, level + 1);
        }
    }

    public void viewTree() {
        viewTree(root, 0);
    }
}
