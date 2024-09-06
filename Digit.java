import java.util.*;
class Digit
{
    public static void main(String args[])
    {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the integer number");
        a=in.nextInt();
        if(a>=-9 && a<=9)
        {
            System.out.println("integer is single digit");
        }
        else if(a>=-99 && a<=99)
        System.out.println("integer is double digit");
        else if(a>=-999 && a<=999)
        System.out.println("integer is Triple digit");
        else
        System.out.println("integer is more than triple digit");
    }
}