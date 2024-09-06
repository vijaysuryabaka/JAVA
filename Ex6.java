import java.util.*;
class Ex6
{
    public static void main (String args[])
    {
        int s=0,n;
        Scanner din=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=din.nextInt();
        int [] a =new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the value for a");
            a[i]=din.nextInt();
            s+=a[i];
        }
        System.out.println("sum=="+s);
    }
}