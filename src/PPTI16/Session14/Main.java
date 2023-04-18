package PPTI16.Session14;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] angka = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int total = 0;
//        for (int a: angka) {
//            if (a % 2 == 1) {
//                total += a;
//            }
//        }
        int t = Arrays.stream(angka)
                .map(a -> a * 2)
                //.skip(5)
                .min().orElse(0);
                //.filter(a -> a % 2 == 1)
                //.sum();
        System.out.println(t);

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(Arrays.stream(new Integer[]{1, 2, 3}).toList()));
        lists.add(new ArrayList<>(Arrays.stream(new Integer[]{4, 5, 6}).toList()));
        List<Integer> merge = lists.stream().flatMap(Collection::stream).toList();

//        for (int a: merge) {
//            System.out.println(a);
//        }
        List<Integer> dis = Arrays.stream(new int[]{1, 1, 2, 2, 3, 3, 4, 4})
                .distinct()
                .boxed().toList();
        System.out.println(dis.stream().map(Object::toString)
                .reduce((a, b) -> a + ", " + b));
    }
}
