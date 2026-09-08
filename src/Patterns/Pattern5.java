import java.util.*;

public class Pattern5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no:");
        int n = sc.nextInt();

        /*
            Pattern 5:
            Print numbers in decreasing order in each row.

            Example for n = 5:

            54321
            4321
            321
            21
            1

            Logic:
            - Outer loop controls the rows.
            - Inner loop starts from n - i.
            - In each row, numbers are printed in decreasing order.
            - The number of elements decreases by one in every row.
        */

        for(int i = 0; i < n; i++)
        {
            for(int j = n - i; j > 0; j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}