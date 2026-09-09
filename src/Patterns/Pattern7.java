import java.util.Scanner;

public class Pattern7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no of rows:");
        int n = sc.nextInt();

        /*
            Pattern 7:
            Print a centered pyramid of stars.

            Example for n = 5:

                *
               ***
              *****
             *******
            *********

            Logic:
            - Outer loop controls the rows.
            - First inner loop prints left spaces.
            - Second inner loop prints stars.
            - Number of stars in each row = (2 * r) - 1.
            - Spaces decrease as the row number increases.
        */

        for(int r = 1; r <= n; r++)
        {
            for(int l = 1; l <= (n - r); l++)
                System.out.print(" ");

            for(int s = 1; s <= ((2 * r) - 1); s++)
                System.out.print("*");

            for(int ri = 1; ri <= (n - r); ri++)
                System.out.print(" ");

            System.out.println();
        }

        sc.close();
    }
}