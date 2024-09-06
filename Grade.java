import java.util.*;
class Grade
{
    public static void main(String args[])
    {
        int a,b,c,d,e,tot;
        float av;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the mark of sub 1");
        a=in.nextInt();
        System.out.println("enter the mark of sub 2");
        b=in.nextInt();
        System.out.println("enter the mark of sub 3");
        c=in.nextInt();
        System.out.println("enter the mark of sub 4");
        d=in.nextInt();
        System.out.println("enter the mark of sub 5");
        e=in.nextInt();
        if(a>=50 && b>=50 && c>=50 && d>=50 && e>=50)
        {  
            System.out.println("ALL Pass");
            tot=a+b+c+d+e;
            av=tot/5;
            System.out.println(av);
            if(av>=90)
            System.out.println("S grade");
            else if(av>=80 && av<90)
            System.out.println("A grade");
            else if(av>=70 && av<80)
            System.out.println("B grade");
            else if(av>=60 && av<70)
            System.out.println("C grade");
            else if(av>=50 && av<60)
            System.out.println("D grade");
            
        }
        else 
        System.out.println("F grade");
    }
}