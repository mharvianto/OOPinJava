package PPTI16.Session02;

import java.util.Scanner;

public class Inputan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;

        do {
            try {
                age = in.nextInt();
            } catch (Exception ex) {
                in.nextLine();
                age = 0;
                System.out.println(ex.getMessage());
            }
        } while (age < 18);
        System.out.println("Age : " + age);
    }
}
