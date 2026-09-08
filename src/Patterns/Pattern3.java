import java.util.Scanner;

/*
 * Pattern 3
 *
 * Description:
 * Prints a number pattern where each row contains
 * numbers starting from 1 up to the current row number.
 *
 * Example for n = 5:
 *
 * 1
 * 12
 * 123
 * 1234
 * 12345
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = sc.nextInt();

        // Outer loop controls the number of rows.
        for(int i = 1; i <= n; i++)
        {
            // Move to the next line after completing each row.
            System.out.println();

            // Inner loop prints numbers from 1 to the current row number.
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
        }

        sc.close();
    }
}