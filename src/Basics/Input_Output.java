/*
 * Program: Input and Output Using Scanner
 *
 * Description:
 * This program demonstrates how to take an integer as input from
 * the user using the Scanner class and display the entered value
 * on the console.
 *
 * Two approaches are included:
 *
 * 1. Basic Approach:
 *    Uses an object of the Solution class and an instance method
 *    to perform input and output.
 *
 * 2. Optimized Approach:
 *    Uses a static method that accepts the Scanner object as a
 *    parameter and returns the entered integer.
 *
 * The optimized approach avoids unnecessary instance variables
 * and keeps the input operation within a reusable method.
 */


/*
 * =========================
 * Basic Approach
 * =========================
 *
 * import java.util.*;
 *
 * class Solution
 * {
 *     int n = 0;
 *
 *     // Scanner object used to take input.
 *     Scanner sc = new Scanner(System.in);
 *
 *     public void inp_out()
 *     {
 *         System.out.println("Enter any no you want to be printed");
 *
 *         // Read an integer from the user.
 *         n = sc.nextInt();
 *
 *         // Display the entered number.
 *         System.out.println("No you Entered " + n);
 *     }
 * }
 *
 * public class Input_Output
 * {
 *     public static void main(String[] args)
 *     {
 *         Solution sol = new Solution();
 *         sol.inp_out();
 *     }
 * }
 */


/*
 * =========================
 * Optimized Approach
 * =========================
 */

import java.util.*;

class Solution
{
    /*
     * Takes a Scanner object as input, reads an integer,
     * and returns the entered value.
     */
    public static int inp_out(Scanner sc)
    {
        System.out.println("Enter the no");

        // Read and return the integer entered by the user.
        return sc.nextInt();
    }
}

public class Input_Output
{
    public static void main(String args[])
    {
        // Create a Scanner object for user input.
        Scanner sc = new Scanner(System.in);

        // Call the method and display the returned value.
        System.out.println("No you enetred " + Solution.inp_out(sc));
    }
}