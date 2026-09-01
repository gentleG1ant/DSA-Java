/*
 * Program: Reverse an Array
 *
 * Description:
 * This program reverses an array using the two-pointer approach.
 *
 * Approach:
 * Two pointers are used:
 * 1. f -> points to the first element.
 * 2. e -> points to the last element.
 *
 * The elements at f and e are swapped.
 * Then f is moved forward and e is moved backward.
 *
 * The process continues until both pointers meet.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class NSolution
{
    // Reverses the array using the two-pointer approach.
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    void reverse(int arr[], int n)
    {
        int f = 0;          // First pointer
        int e = n - 1;      // Last pointer
        int temp;

        // Continue until the two pointers meet.
        while(f < e)
        {
            // Swap elements at the two pointers.
            temp = arr[f];
            arr[f] = arr[e];
            arr[e] = temp;

            // Move pointers towards the center.
            f++;
            e--;
        }

        // Display the reversed array.
        for(int num : arr)
            System.out.print(num + " ");

        System.out.println();
    }
}

public class reverseArray
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};

        int n = arr.length;

        NSolution s = new NSolution();

        // Reverse the array.
        s.reverse(arr, n);
    }
}