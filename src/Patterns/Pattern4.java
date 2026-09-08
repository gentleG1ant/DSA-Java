import java.util.*;

class pattern4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no:");
        int n = sc.nextInt();

        /*
            Pattern 4:
            Print the row number repeatedly in each row.

            Example for n = 5:

            1
            22
            333
            4444
            55555

            Logic:
            - Outer loop controls the rows.
            - Inner loop prints the current row number.
            - Number of times printed = row number.
        */

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }

            System.out.println();
        }

        sc.close();
    }
}