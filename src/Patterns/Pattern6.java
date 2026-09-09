import java.util.Scanner;

public class Pattern6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no:");
        int n = sc.nextInt();

        /*
            Pattern 6:
            Print stars in decreasing order in each row.

            Example for n = 5:

            *****
            ****
            ***
            **
            *

            Logic:
            - Outer loop controls the rows.
            - Inner loop prints the stars.
            - Number of stars starts from n.
            - One star is removed from each subsequent row.
        */

        for(int i = 0; i < n; i++)
        {
            for(int j = n - i; j > 0; j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}