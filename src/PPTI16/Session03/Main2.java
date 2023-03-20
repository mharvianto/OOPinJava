package PPTI16.Session03;

import java.util.Scanner;
import java.util.Vector;

public class Main2 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Budi");
        vec.add(0, "Ani"); // push mid
        vec.set(1, "Cacha");
        System.out.println(vec.get(0));
        System.out.println(vec.get(1));
        System.out.println(vec.capacity());
        // vec.
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    static Scanner sc = new Scanner(System.in);

    // method
    static int fibo(int n) {
        if (n <= 1) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
