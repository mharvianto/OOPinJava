package PPTI15.Session06.Main;

import PPTI15.Session06.GatotKaca;
import PPTI15.Session06.Hero;
import PPTI15.Session06.Panji;

public class Main {
    /*
    overloading
    1 class
    - sama nama method
    - beda jumlah parameter
    - beda type data parameter

    overriding
    beda class
    - sama nama method, jumlah param, type data param

    abstract class -> class yang memiliki abstract method
    abstract method -> method belum di deskripsikan
    interface
     */
    public static void main(String[] args) {
        GatotKaca p1 = new GatotKaca();
        GatotKaca p2 = new GatotKaca();
//        Hero h1 = new Hero();
        // anonymous class
        Hero p3 = new Hero() {
            @Override
            public void skill1(Hero target) {
                System.out.println("Skill 1");
            }
        };
        Hero p4 = new GatotKaca();
        Hero p5 = new Panji();
        System.out.println("Level= " + p1.getLvl());
        p1.attack(p2);
        p2.skill1(p1);
        p4.skill1(p3);
        p3.skill1(p4); // cetak skill 1
        p5.skill1(p3);
        System.out.println("HP p1= " + p1.getHp());
        System.out.println("HP p2= " + p2.getHp());
        System.out.println("HP p3= " + p3.getHp());
        System.out.println("HP p4= " + p4.getHp());
    }
}
