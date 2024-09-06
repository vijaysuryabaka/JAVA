import java.util.Scanner;

import multi.*;

class Ex16 {
    public static void main(String[] args) {
        Scanner pin = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a1 = pin.nextInt();
        System.out.println("Enter the value of B");
        int b1 = pin.nextInt();
        multiple m = new multiple(a1, b1);
        m.pro();
        m.display();
    }
}