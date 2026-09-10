import java.util.Scanner;

public class Pattern9
{
    static int n;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no:");
        n = sc.nextInt();

        /*
            Pattern 9:
            Print a diamond-shaped pattern of stars.

            Example for n = 5:

                *
               ***
              *****
             *******
            *********
             *******
              *****
               ***
                *

            Approach:
            - The diamond is divided into two parts:
              1. Top half
              2. Bottom half
            - The top() method prints the increasing pyramid.
            - The bottom() method prints the decreasing pyramid.
            - Both methods are called from main().
        */

        top();
        bottom();

        sc.close();
    }

    /*
        Top Half:
        Prints the increasing part of the diamond.
    */
    static void top()
    {
        for(int r = 0; r < n; r++)
        {
            for(int l = 0; l < n - r - 1; l++)
                System.out.print(" ");

            for(int s = 1; s <= 2 * r + 1; s++)
                System.out.print("*");

            System.out.println();
        }
    }

    /*
        Bottom Half:
        Prints the decreasing part of the diamond.
    */
    static void bottom()
    {
        for(int r = n - 2; r >= 0; r--)
        {
            for(int l = 0; l < n - r - 1; l++)
                System.out.print(" ");

            for(int s = 1; s <= 2 * r + 1; s++)
                System.out.print("*");

            for(int ri = 1; ri <= r; ri++)
                System.out.print(" ");

            System.out.println();
        }
    }
}