package PPTI16.Session04;

public class Student {
    private String id;
    private String name;
    private String className;
    private int score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 20) {
            throw new IllegalArgumentException("Panjang nama mesti lebih pendek dari 20");
        }
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student(String name, String className) {
        id = "" + (long)(Math.random() * 4000000000L);
        setName(name);
        this.className = className;
    }

    void study() {
        if (score + 10 < 100) {
            score += 10;
        } else {
            score = 100;
        }
        System.out.println("Study " + score);
    }

    void show() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Score: " + score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("Score mesti diantara 0 - 100.");
            // return;
        }
        this.score = score;
    }

    /**
     * access modifier -> encapsulation
     *                      class | package | turunan | public
     * public               x     | x       | x       | x
     * protected            x     | x       | x       |
     * package/default      x     | x       |         |
     * private              x     |         |         |
     *
     * setter / getter
     */
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Stephennnnnnnnnnnnnnnnnnnnnnnnnnnn", "PPTI16");
        student1.show();
        student1.study();
        student1.study();
        student1.setScore(1000);
        student1.show();
    }
}
