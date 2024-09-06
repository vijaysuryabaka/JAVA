import java.util.*;

class Ex5
{
    public static void main (String args[])
    {
        int [] a= {1,2,3,4,5};
        int s=0;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            s+=a[i];
        }
        System.out.println("sum=="+s);
    }
}