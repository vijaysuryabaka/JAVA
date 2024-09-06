import java.util.*;

class Prime
{
    public static void main(String[] args)
    {
        int n,ch;
        Scanner din=new Scanner(System.in);
        System.out.println("Enter the choice:\n 1.Print the range of Prime\n2.Check prime of not");
        ch=din.nextInt();

        switch(ch)
        {
            case 1:
            {
                System.out.println("Enter the range of prime numbers");
                n=din.nextInt();
                for(int i=0;i<n;i++)
                {
                    if (n>1)
                    {
                        for(i=2;i<n;i++)
                        {
                            if(n%i ==0)
                            {
                                break;
                            }
                        else
                        {
                            System.out.println(i);
                        }
                    }
                    }
                }


             }
             case 2:
             {
                System.out.println("Enter the number");
                n=din.nextInt();
                if(n==1)
                {
                    System.out.println("not a Prime");
                }
                else if(n>1)
                {
                for(int i=2;i<n;i++)
                {
                    if(n%i==0)
                    {
                        System.out.println("not a Prime");
                        
                    }
                    else
                    {
                        System.out.println("Prime Number");
                        break;
                    }
                }
                }
                else{
                    System.out.println("not a Prime");
                }

             }
             
             default:
             {
                System.out.println("Exit");
             }
        
       
    }
    }
}