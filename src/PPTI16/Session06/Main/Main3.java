package PPTI16.Session06.Main;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokemon poke;
        int t = sc.nextInt();
        if (t == 1) {
            poke = new Pikachu();
        } else if (t == 2) {
            poke = new Charizard();
        } else {
            // anonymous object
            poke = new Pokemon() {
                @Override
                void attack() {
                    System.out.println("Air");
                    hp += 10;
                }

                @Override
                void skill() {
                    System.out.println("Serangan air");
                }
            };
            poke.atk = 90;
        }
        System.out.println("Poke: " + poke);
        System.out.println("Atk: " + poke.atk);
        poke.attack();
        poke.skill();
//        if (poke instanceof Pokemon) {
//            System.out.println("turunan pokemon");
//        }
        if (poke instanceof Charizard) {
//            poke.ulti
            ((Charizard) poke).ulti();
        }
    }
}

abstract class Pokemon {
    int atk;
    int hp;

    abstract void attack();

    abstract void skill();

    @Override
    public String toString() {
//        super.toString();
        return this.getClass().getName() + " " + atk + " " + hp;
    }
}

class Pikachu extends Pokemon {
    public Pikachu() {
        atk = 100;
    }

    @Override
    void attack() {
        System.out.println("Thunder");
    }

    @Override
    void skill() {
        System.out.println("Skill Pikachu");
    }
}

class Charizard extends Pokemon {
    public Charizard() {
        atk = 110;
    }

    @Override
    void attack() {
        System.out.println("Api");
    }

    @Override
    void skill() {
        System.out.println("Skill Charizard");
    }

    void ulti() {
        System.out.println("Skill Charizard Ulti");
    }
}
