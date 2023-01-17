package PPTI15.Session04;

public class Main {
    public static void main(String[] args) {
        Hero p1 = new Hero("Alice");
        p1.setAtk(10);
        p1.show();
        p1.train();
        p1.show();
    }
}

/*
Access modifier
                    class | package | inheritance | public/all
public              x     | x       | x           | x
protected           x     | x       | x           |
package/default     x     | x       |             |
private             x     |         |             |
 */
