package PPTI16.Session01;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        int a = 10;
        System.out.println("a = " + a);
        double b = 22.0 / 7.0;
        System.out.printf("b = %.2f\n", b);
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Name = " + name);
        switch (name) {
            case "Daniel":
                System.out.println("Selamat Pagi");
                break;
            default:
                System.out.println("Selamat Siang");
        }
        int c = scan.nextInt();
        System.out.println("c = " + c);
        for (int i = 0; i < c * 10000000; i++) {
            System.out.println("loop");
        }
    }
}
