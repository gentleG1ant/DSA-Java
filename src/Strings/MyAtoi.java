package Strings;

import java.util.Scanner;

/*
 * Problem: String to Integer (atoi)
 *
 * Functionality:
 * Converts a string containing a signed integer into an int.
 * - Ignores leading spaces
 * - Handles '+' and '-' signs
 * - Reads digits until a non-digit character is encountered
 * - Handles integer overflow by returning Integer.MAX_VALUE
 *   or Integer.MIN_VALUE
 *
 * Approach:
 * Single-pass traversal of the string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Atoi {

    int AtoiNum(String s) {

        int i = 0;
        int sign = 1;
        int num = 0;

        // Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        // Check for sign
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }

        // Convert consecutive digits into an integer
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int dig = s.charAt(i) - '0';

            /*
             * Check for overflow before:
             * num = num * 10 + dig
             */
            if (num > (Integer.MAX_VALUE - dig) / 10) {

                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }

            num = (num * 10) + dig;
            i++;
        }

        return sign * num;
    }
}

public class MyAtoi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        Atoi as = new Atoi();

        System.out.println(as.AtoiNum(s));

        sc.close();
    }
}
