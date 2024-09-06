import java.util.Scanner;
public class Prime{
    public static void main(String args[])
    {
        int i,j,e,n,c,count=0;
        Scanner din=new Scanner(System.in);
        System.out.println("1.Prime Number or Not");
        System.out.println("2.Prime Number between the ranges");
        System.out.println("Enter your choice: ");
        c=din.nextInt();
        switch (c) {
            case 1:
              System.out.println("Enter the number: ");
              n=din.nextInt();
              for(i=1;i<=n;i++)
              {
                if(n%i==0)
                {
                    count++;
                }
              }
              if(count==2)
              {
                System.out.println(n+" prime number");
              } 
              else
              {
                System.out.println(n+"  not a prime number");
              }
              break;
            case 2:
                System.out.println("\nEnter range number:");
                e=din.nextInt();
                for(i=0;i<=e;i++)
                {
                    for(j=2;j<=i;j++)
                    {
                        if(i%j==0)
                        {
                            break;
                        }
                    }
                    if(i==j)
                    System.out.println("\t"+i);
                }
                break;
            default:
              System.out.println("Enter a vaild choice");
              break;
            }
          }
}