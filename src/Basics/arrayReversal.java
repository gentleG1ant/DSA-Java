import java.util.Scanner;

/*
 * Program: Array Reversal
 *
 * This program takes an array as input and creates
 * another array with the elements in reverse order.
 *
 * Approach:
 * Store each element of the original array at the
 * opposite position in the new array.
 */

public class arrayReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] reversedArr = new int[n];

        // Read the array elements.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            // Store the element at the opposite position.
            reversedArr[n - 1 - i] = arr[i];
        }

        System.out.print("Original Array = ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.print("\nReversed Array = ");
        for (int element : reversedArr) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}