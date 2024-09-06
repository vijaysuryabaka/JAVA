import java.util.*;

class x1 {
    int a, b, c;

    void read() {
        Scanner din = new Scanner(System.in);
        System.out.print("enter A value:");
        a = din.nextInt();
        System.out.print("enter B value:");
        b = din.nextInt();
    }
}

class y1 extends x1 {
    void cal() {

        c = a + b;

    }

}

class z1 extends y1 {
    void dis() {
        System.out.println("c = " +c);
    }
}

public class Ex10 {
    public static void main(String args[]) {
        z1 da = new z1();
        da.read();
        da.cal();
        da.dis();
    }

}
