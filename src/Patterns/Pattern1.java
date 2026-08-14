import java.util.Scanner;

/*
Program: Square Star Pattern

Description:
Prints a square pattern of stars based on the size entered by the user.

Pattern for n = 4:
* * * *
* * * *
* * * *
* * * *

Approach:
1. Take the size of the pattern as input.
2. Use an outer loop to control the rows.
3. Use an inner loop to print n stars in each row.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class Pattern1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();

        // Outer loop controls the rows.
        for (int i = 0; i < n; i++) {

            // Inner loop prints stars in each row.
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}