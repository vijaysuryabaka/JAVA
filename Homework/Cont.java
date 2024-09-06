import java.util.*;

class add {
    int a, b, c;

    add() {
        a = 10;
        b = 20;
        c = a + b;
    }

    void display() {
        System.out.println("Sum  :" + c);
    }
}

public class Cont {
    public static void main(String args[]) {
        add a1 = new add();
        a1.display();
    }

}
