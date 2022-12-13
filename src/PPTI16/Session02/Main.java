package PPTI16.Session02;

public class Main {
    public static void main(String[] args) {
        Integer a = -7;
        int b = Integer.MAX_VALUE;
        String str = new String("Hello world");
        System.out.println(Math.abs(a));
        System.out.println(Math.floor(500 + Math.random() * 501));
        System.out.println(str == "Hello world");
        System.out.println(str.equals("Hello world"));
        String c[] = str.split(" ");
        System.out.println(c[0]);
        System.out.println(str.contains("wo"));
        char kata[] = str.toCharArray();
        kata[6] = 'W';
        System.out.println(kata);

    }
}
