import java.util.Scanner;

public class Student {
    String name, N;
    int id, i;

    void input(String na, int id) {
        N = na;
        i = id;

    }

    void display() {
        System.out.println("\n\n\nOii BAKA");
        System.out.println(N);
        System.out.println(i);
    }
}

class Sam {
    public static void main(String args[]) {
        Student s = new Student();
        Scanner din = new Scanner(System.in);
        System.out.println("Enter you name:");
        s.name = din.next();
        System.out.println("Enter your ID:");
        s.id = din.nextInt();
        s.input(s.name, s.id);
        s.display();

    }

}
