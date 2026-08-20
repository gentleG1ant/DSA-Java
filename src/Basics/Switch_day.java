/*
 * Program: Display Day Using Switch Case
 *
 * Description:
 * This program accepts a number from 1 to 7 as input and uses a
 * switch statement to display the corresponding day of the week.
 *
 * The program demonstrates:
 * - Taking user input using Scanner.
 * - Using a switch statement for multiple possible values.
 * - Using break to terminate each matching case.
 * - Using default to handle invalid input.
 */

import java.util.*;

// Print day based on the given number
public class Switch_day
{
    public static void main(String day[])
    {
        // Create a Scanner object to accept user input.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no to print its Day(1 to 7)");

        // Read the day number from the user.
        int n = sc.nextInt();

        // Match the input number with the corresponding day.
        switch(n)
        {
            case 1:
                System.out.println("MONDAY");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Sturday");
                break;

            case 7:
                System.out.println("Sturday");
                break;

            // Executes when the input is outside the range 1 to 7.
            default:
                System.out.println("Invalid Input");
        }
    }
}