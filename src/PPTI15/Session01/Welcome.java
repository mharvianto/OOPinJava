package PPTI15.Session01;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        int a = 10;
        System.out.println("a = " + a);
        double b = 22.0 / 7.0;
        System.out.printf("b = %.2f\n", b);
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Name = " + name);
        switch (name) {
            case "Jefferson":
                System.out.println("Selamat Pagi");
                break;
            default:
                System.out.println("Selamat Siang");
        }
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("loop " + (i + 1));
        }
    }
}
