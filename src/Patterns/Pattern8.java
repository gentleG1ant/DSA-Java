import java.util.Scanner;

public class Pattern8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no:");
        int n = sc.nextInt();

        /*
            Pattern 8:
            Print an inverted centered pyramid of stars.

            Example for n = 5:

            *********
             *******
              *****
               ***
                *

            Logic:
            - Outer loop starts from n and decreases to 1.
            - Left spaces increase as the row number decreases.
            - Number of stars in each row = 2 * (ro - 1) + 1.
            - Right spaces are printed to maintain the centered structure.
        */

        for(int ro = n; ro >= 1; ro--)
        {
            for(int l = 0; l < n - ro; l++)
                System.out.print(" ");

            for(int s = 1; s <= (2 * (ro - 1) + 1); s++)
                System.out.print("*");

            for(int r = 0; r < n - ro; r++)
                System.out.print(" ");

            System.out.println();
        }

        sc.close();
    }
}