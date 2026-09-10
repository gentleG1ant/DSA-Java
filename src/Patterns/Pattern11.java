import java.util.Scanner;

public class Pattern11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any valid integer:");
        int n = sc.nextInt();

        pattern(n);

        sc.close();
    }

    /*
        Pattern 11:
        Print an alternating binary pattern.

        Example for n = 5:

        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

        Logic:
        - The outer loop controls the rows.
        - Odd rows start with 1.
        - Even rows start with 0.
        - The value alternates between 0 and 1 after each print.
        - The expression start = 1 - start switches:
          0 -> 1
          1 -> 0
    */

    static void pattern(int n)
    {
        int start;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
                start = 0;
            else
                start = 1;

            for(int j = 1; j <= i; j++)
            {
                System.out.print(start + " ");
                start = 1 - start;
            }

            System.out.println();
        }
    }
}