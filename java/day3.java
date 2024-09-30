import java.util.*;

public class day3 {
    public static void main (String args[])
    {
        int a[]=new int[10];
        Scanner Sc= new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            a[i]=Sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum="+sum);
    }
    
}
