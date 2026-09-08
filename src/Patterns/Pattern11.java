package Day11;
import java.util.*;
public class Pattern11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any valid integer");
        int n=sc.nextInt();
        pattern(n);
    }
     static void pattern(int n)
    {
        int start;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                start=0;
            else
                start=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}
