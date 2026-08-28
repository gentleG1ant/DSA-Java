import java.util.*;

public class ArrayRotate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array from the user.
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Taking array elements as input.
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        /*
         * Left Rotation of the array by one position.
         *
         * Example:
         * Original array:  1 2 3 4 5
         * After rotation:  2 3 4 5 1
         */

        // Store the first element temporarily.
        int temp = arr[0];

        // Shift every element one position to the left.
        for(int i = 1; i < n; i++)
        {
            arr[i - 1] = arr[i];
        }

        // Place the first element at the last position.
        arr[n - 1] = temp;

        // Display the rotated array.
        System.out.println("Array after left rotation by one position:");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }

        sc.close();
    }
}