package PPTI16.Session11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BST<String> bst = new BST<>();
//        bst.push("Kevin");
//        bst.push("Marvel");
//        bst.push("Athalia");
//        bst.push("Daniel");
//        bst.push("Ferren");
//        bst.viewTree();
//        BST<Integer> angka = new BST<>();
//        for (int i = 0; i < 100; i++) {
//            angka.push((int)(Math.random() * 1000));
//        }
//        angka.viewTree();
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                cetak();
            }
        });
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                cetak();
            }
        });
        th.start();
        th1.start();
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            a = sc.nextInt();
            for (int i = 0; i < a; i++) {
                System.out.println("input " + i);
            }
        } while(a != 0);
    }
    static void cetak() {
        int id = (int) (Math.random() * 10000);
        int a=0;
        while (true) {
            System.out.println(id + " loop " + a++);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {

            }
        }
    }
}

class Node<T>
{
    int key;
    T data;
    Node<T> left = null;
    Node<T> right = null;
    public Node(int key, T data) {
        this.key = key;
        this.data = data;
    }
}

class BST<T>
{
    Node<T> root;

    public BST() {
        root = null;
    }

    private Node<T> push(Node<T> curr, int key, T data) {
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

    private void viewTree(Node<T> curr, int level) {
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
