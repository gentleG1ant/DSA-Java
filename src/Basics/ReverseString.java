/*
 * Program: Reverse a String
 *
 * Description:
 * This program reverses a given string by traversing its characters
 * from the last index to the first index and printing each character.
 *
 * The program demonstrates:
 * - Finding the length of a string using length().
 * - Accessing individual characters using charAt().
 * - Traversing a string in reverse order using a for loop.
 */

public class ReverseString
{
    public static void main(String[] args)
    {
        String name = "raj";

        // Store the length of the string.
        int len = name.length();

        // Traverse the string from the last character to the first.
        for(int i = len - 1; i >= 0; i--)
        {
            // Print the character at the current index.
            System.out.print(name.charAt(i));
        }
    }
}