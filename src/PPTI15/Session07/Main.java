package PPTI15.Session07;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> ppti15 = new ArrayList<>();
        Student s = new Student();
        s.name = "Kelvin";
        s.nim = "12345";
        s.score = 50;
        ppti15.add(s);
        ppti15.add(s);
        printStudent(ppti15);
        s.score += 20;
        s = new Student();
        s.name = "Ari";
        s.nim = "23456";
        s.score = 80;
        ppti15.add(s);
        printStudent(ppti15);
    }

    static void printStudent(ArrayList<Student> cls) {
        for (Student student : cls) {
            System.out.println(student);
        }
        System.out.println();
    }

}

class Student {
    String name;
    String nim;
    int score;

    @Override
    public String toString() {
        return String.format("%s %s %d", name, nim, score);
    }
}
