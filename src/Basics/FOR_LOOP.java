/*
 * Program: Sum of Numbers in a Given Range
 *
 * Description:
 * This program accepts a lower and upper limit from the user
 * and calculates the sum of all integers within the specified range.
 *
 * The program demonstrates:
 * - Passing a Scanner object as a method argument.
 * - Using a for loop to iterate through a specified range.
 * - Accumulating values using a sum variable.
 */

import java.util.*;

class loop
{
    /*
     * Accepts a Scanner object as an argument and calculates
     * the sum of all integers from the lower limit to the upper limit.
     */
    static void loop_func(Scanner sc)
    {
        int sum = 0;

        // Read the lower and upper limits from the user.
        System.out.println("Enter the low and high");
        int l = sc.nextInt();
        int h = sc.nextInt();

        // Iterate through the range and add each number to sum.
        for(int i = l; i <= h; i++)
        {
            sum += i;
        }

        // Display the calculated sum.
        System.out.println("Sum of all the no between the range = " + sum);
    }
}

public class FOR_LOOP
{
    public static void main(String args[])
    {
        // Create a Scanner object to accept user input.
        Scanner sc = new Scanner(System.in);

        // Pass the Scanner object to the method for input handling.
        loop.loop_func(sc);
    }
}