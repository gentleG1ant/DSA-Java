import java.util.Scanner;

/*
Program: Increasing Star Pattern

Description:
Prints a right-angled triangle pattern of stars.
The number of stars increases by one in each row.

Pattern for n = 5:
*
* *
* * *
* * * *
* * * * *

Approach:
1. Take the number of rows as input.
2. Use an outer loop to control the rows.
3. Use an inner loop to print stars.
4. In each row, print stars equal to the row number.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class Pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop controls the rows.
        for (int i = 0; i < n; i++) {

            // Inner loop prints stars according to the current row.
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}