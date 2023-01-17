package PPTI15.Session04;

public class Hero {
    // attribute / variable
    private String name;
    private int atk;
    private int energy;

    // behavior / method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 100) {
            throw new IllegalArgumentException("Panjang nama mesti lebih pendek dari 100.");
        }
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void sleep() {
        if (energy + 50 < 100) {
            energy += 50;
        } else {
            energy = 100;
        }
        System.out.println("Energy: " + energy);
    }

    public void train() {
        if (energy - 10 >= 0) {
            atk += 5;
            energy -= 10;
            System.out.println("Atk: " + atk);
            System.out.println("Energy: " + energy);
        }
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Atk: " + atk);
        System.out.println("Energy: " + energy);
    }

    // getter
    public int getAtk() {
        return atk;
    }

    // setter
    public void setAtk(int atk) {
        if (atk > 1000 || atk < 0) {
            throw new IllegalArgumentException("Atk mesti diantara 0 - 1000");
            // return;
        }
        this.atk = atk;
    }

    // constructor
    public Hero(String name) {
        setName(name);
        // this.name = name;
        energy = 100;
    }

    // overloading
    // nama method sama, jumlah param beda, type param beda
    public Hero(String name, int energy) {
        setName(name);
        // this.name = name;
        this.energy = energy;
    }
}
