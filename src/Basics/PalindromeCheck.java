import java.util.Scanner;

/**
 * Program: Palindrome Check
 *
 * A palindrome is a string that reads the same forward and backward.
 *
 * Example:
 * Input  : madam
 * Output : madam is a palindrome
 *
 * Approaches:
 *
 * 1. Manual Reversal:
 *    Reverse the string manually and compare it with the original.
 *
 * 2. Two-Pointer:
 *    Compare characters from both ends and move towards the center.
 *    This avoids creating a separate reversed string.
 *
 * 3. StringBuilder:
 *    Use StringBuilder's reverse() method and compare the result
 *    with the original string.
 *
 * Time Complexity:
 * Manual Reversal : O(n)
 * Two-Pointer     : O(n)
 * StringBuilder   : O(n)
 *
 * Space Complexity:
 * Manual Reversal : O(n)
 * Two-Pointer     : O(1)
 * StringBuilder   : O(n)
 *
 * Author: Raj Aryan
 */

public class PalindromeCheck {

    public static void main(String[] pali) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string to be checked");
        String inp = sc.next();

        // Approach 1: Manual Reversal and Comparison

        boolean isSame = true;
        int len = inp.length();
        String copy = "";

        for (int i = len - 1; i >= 0; i--) {
            copy = copy + inp.charAt(i);
        }

        int j = 0;

        while (j < len) {

            if (inp.charAt(j) != copy.charAt(j)) {
                isSame = false;
                break;
            }

            j++;
        }

        if (isSame) {
            System.out.println(inp + " & " + copy + " is palindrome");
        } else {
            System.out.println(inp + " & " + copy + " is not palindrome");
        }


        /*
         * Approach 2: Two-Pointer Method
         */

        /*
        boolean isSame = true;

        int f = 0;
        int r = inp.length() - 1;

        while (r > f || f < r) {

            if (inp.charAt(f) == inp.charAt(r)) {
                r--;
                f++;
            } else {
                isSame = false;
                System.out.println("Entered string is not palindrome");
                break;
            }
        }

        if (isSame) {
            System.out.println("Entered string is palindrome");
        }
        */


        /*
         * Approach 3: StringBuilder
         */

        /*
        boolean isSame = true;

        StringBuilder sb = new StringBuilder(inp);

        String reversed = sb.reverse().toString();

        if (inp.equals(reversed)) {
            System.out.println("Entered String is a palindrome");
        } else {
            System.out.println("Entered string is not palindrome");
        }
        */

        sc.close();
    }
}