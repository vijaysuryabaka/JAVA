import java.io.*;
import java.util.*;

public class Rev {
    public static void main(String[] args) {
        String str = "";
        Scanner din=new Scanner(System.in);
        System.out.println("Enter the string");
        str=din.nextLine();
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}