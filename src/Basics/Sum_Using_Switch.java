/*
 * Program: Switch Case with an Expression
 *
 * Description:
 * This program demonstrates the use of an arithmetic expression
 * as the input to a switch statement. The values of two integers
 * are added, and the resulting value is compared against the
 * available case labels.
 *
 * The program demonstrates:
 * - Using an expression as the switch condition.
 * - Matching the evaluated result with case labels.
 * - Using break to prevent fall-through.
 * - Using default when no case matches.
 */

public class Sum_Using_Switch
{
    public static void main(String[] sum)
    {
        int n = 15;
        int m = 12;

        /*
         * A switch statement can evaluate an expression and compare
         * its result with constant case values.
         *
         * Here, m + n is evaluated first:
         *
         * m + n = 12 + 15 = 27
         *
         * Therefore, case 27 will be executed.
         */
        switch(m + n)
        {
            case 28:
                System.out.println("28");
                break;

            case 18:
                System.out.println("18");
                break;

            case 27:
                System.out.println("27");
                break;

            // Executed when none of the cases match.
            default:
                System.out.println("Invalid");
        }
    }
}