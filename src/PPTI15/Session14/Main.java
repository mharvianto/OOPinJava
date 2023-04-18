package PPTI15.Session14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for(int num : numbers) {
            if(num % 2 == 1) {
                total += num * num;
            }
        }
        int t = Arrays.stream(numbers).filter(a -> a % 2 == 1)
                .map(a -> a * a).sum();
        var a = Arrays.stream(numbers).average().orElse(0.0);
        // a = "asd";
        System.out.println(total + " " + t);
        System.out.println(a);
    }
}
