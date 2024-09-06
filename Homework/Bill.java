import java.util.*;

class Bill
{
    public static void main(String[] args)
    {
        int n,tot,s=0;
        Scanner din = new Scanner(System.in);
        System.out.println("\n\t\tNELGIRIS\n");
        System.out.println("\tProduct Number\t\tProduct Name\tPrice");
        System.out.println("\t\t1.\t\tMuruku\t\t25/-\n\t\t2.\t\tChoc\t\t10/-\n\t\t3.\t\tChips\t\t50/-");
        System.out.println("Enter the number of Products do u want");
        n=din.nextInt();
        int[] pn = new int[n];
        int[] qn = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Product Number");
            pn[i]=din.nextInt();
            System.out.println("Enter the No. of Quantity");
            qn[i]=din.nextInt();
        }
        System.out.println("\n\n\t\t\tNELGRIS\n");
        System.out.println("\n\tProduct Number\t\tProduct Name\tQuantity\t\t\tPrice\n");
        for(int i=0;i<n;i++)
        {
            if(pn[i]==1)
            {
                tot=qn[i]*25;
                System.out.println("\t\t1.\t\tMuruku\t\t"+qn[i]+"*25\t\t\t"+tot);
            }
            else if(pn[i]==2)
            {
                tot=qn[i]*10;
                System.out.println("\t\t2.\t\tChoc\t\t"+qn[i]+"*10\t\t\t"+tot);
            }
            else
            {
                tot=qn[i]*50;
                System.out.println("\t\t3..\t\tChips\t\t"+qn[i]+"*50\t\t\t"+tot);
            }
            s+=tot;
            
        }
        System.out.println("\n\t\tTotal\t\t\t\t\t\t\t" +s);

        

        System.out.println("\n\t\tThank you visit you again!\n");


    }
}