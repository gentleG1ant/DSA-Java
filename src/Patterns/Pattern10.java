import java.util.Scanner;

public class Pattern10
{
    static int n;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any positive integer value:");
        n = sc.nextInt();

        /*
            Pattern 10:
            Print a diamond-like pattern using stars.

            Example for n = 5:

            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *

            Approach:
            - The pattern is divided into two parts:
              1. Top half
              2. Bottom half
            - The top() method prints increasing rows.
            - The bottom() method prints decreasing rows.
            - The largest row contains n stars.
        */

        top();
        bottom();

        sc.close();
    }

    /*
        Top Half:
        Prints rows with an increasing number of stars.
    */
    static void top()
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /*
        Bottom Half:
        Prints rows with a decreasing number of stars.
    */
    static void bottom()
    {
        for(int i = n - 1; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}