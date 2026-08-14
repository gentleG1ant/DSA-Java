import java.util.Scanner;

/**
 * Generates the Fibonacci series for a given number of terms.
 *
 * The Fibonacci series starts with 0 and 1. Each subsequent term
 * is the sum of the previous two terms.
 *
 * Example:
 * Input  : 7
 * Output : 0 1 1 2 3 5 8
 *
 * Approach:
 * - Initialize the first two Fibonacci terms as 0 and 1.
 * - Print the first two terms.
 * - Calculate each subsequent term using the sum of the previous
 *   two terms and update the values for the next iteration.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Raj Aryan
 */
public class FibonaciSeries {

    public static void main(String[] fib) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of iterations you want");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int next = 0;

        // Validate the number of terms.
        if (n > 0) {

            // Handle the case where only the first term is required.
            if (n == 1) {
                System.out.print(a);
            } else {

                System.out.print(a + " " + b);

                // Generate the remaining Fibonacci terms.
                for (int i = 0; i < n - 2; i++) {
                    next = a + b;
                    a = b;
                    b = next;

                    System.out.print(" " + next);
                }
            }

        } else {
            System.out.print("Please enter value greater than 0");
        }

        sc.close();
    }
}