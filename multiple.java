package multi;

public class multiple {
    int a, b, c;

    public multiple(int a1, int b1) {
        a = a1;
        b = b1;
    }

    public void pro() {
        c = a * b;
    }

    public void display() {
        System.out.println("Product" + c);
    }
}