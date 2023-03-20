package PPTI15.Session03;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        arr[0] = 123;
        // System.out.println(arr[0]);
        int[][] duaD = new int[10][10];
        array_list();
        // int n = sc.nextInt();
    }

    static Scanner sc = new Scanner(System.in);

    // method
    static void array_list() {
        ArrayList<Integer> score = new ArrayList<>();
        score.add(758); // push tail / belakang
        score.add(0, 456); // push mid
        // overloading, nama function sama, beda jumlah param, beda typedata param
        score.set(1, 999);
        System.out.println(score.get(0));
        System.out.println(score.get(1));
        System.out.println("size: " + score.size());
        for (int i = 0; i < 100; i++) {
            score.add((int) (Math.random() * 1000));
        }
        // Collections.sort(score);
        // score.sort(Main::compare);
        score.sort(Integer::compareTo);
        for (int i = 0; i < score.size(); i++) {
            System.out.println(score.get(i));
        }
        score.remove(0); // pop head
        score.remove(score.size() - 1); // pop tail
        System.out.println(score.get(0));
        System.out.println("size: " + score.size());
        score.clear(); // pop all
        System.out.println("size: " + score.size());
        // System.out.println(score.get(0)); // error IndexOutOfBounds
    }

    static void vector() {
        Vector<String> ppti = new Vector<>();
        ppti.add("Budi");
        ppti.add(0, "Dion");
    }

    static int compare(int a, int b) {
        if (a == b) return 0;
        if (a > b) return -1;
        return 1;
    }
}
