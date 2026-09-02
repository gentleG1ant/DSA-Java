import java.util.*;

// Optimal Approach
class SolutionRotate
{
    // Reverses the elements from start to end.
    static void reverse(int arr[], int start, int end)
    {
        while(start < end)
        {
            // Swap the elements.
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move both pointers towards the center.
            start++;
            end--;
        }
    }
}

public class rotateElements
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Enter the no of rotation");
        int d = sc.nextInt();

        int n = arr.length;

        // Normalize the number of rotations.
        d = d % n;

        // Rotate the array to the left.

        // Reverse the first section.
        SolutionRotate.reverse(arr, 0, d - 1);

        // Reverse the second section.
        SolutionRotate.reverse(arr, d, n - 1);

        // Reverse the complete array.
        SolutionRotate.reverse(arr, 0, n - 1);

        // Display the rotated array.
        for(int e : arr)
            System.out.print(e + " ");

        sc.close();
    }
}