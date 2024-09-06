import java.util.*;
class If
{
    public static void main(String args[])
    {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the integer number");
        a=in.nextInt();
        if((a%2)==0)
        {
            System.out.println(a+"=even number");
        }
        else
        System.out.println(a+"=odd number");
    }
}