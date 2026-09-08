package DAY7;
import java.util.*;
public class Pattern10 {

    static int n;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer value");
        n = sc.nextInt();
        top();
        bottom();
    }

    static void top()
    {
        for (int i = 1; i <= n; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void bottom()
    {
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}