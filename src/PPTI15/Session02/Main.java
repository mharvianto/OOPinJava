package PPTI15.Session02;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String str = new String("Hello world");
        System.out.println(str == "Hello world");
        System.out.println(str.equals("Hello world"));
        System.out.println(str.toUpperCase());
        str = str.replace("w", "W");
        str = str.replace('l', '7');
        str = str.replace("He", "Haha");
        System.out.println(str);
        System.out.println("We l co me".trim());
        int a = Integer.parseInt("123456789");
        int b = Integer.valueOf("123456789");
        System.out.println(a + 11);
        System.out.println(b + 211);
        int c = -123;
        long d = 123;
        BigInteger e = BigInteger.valueOf(1);
        System.out.println(Math.abs(c));
        System.out.println(Math.round(Math.random() * 100));
    }
}
