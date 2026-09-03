// Brute Force Method
// Count the number of 0s, 1s and 2s.
// Then overwrite the array according to their counts.

// Optimal Solution
// Dutch National Flag Algorithm

import java.util.*;

class SolutionSort
{
    int sortArray(int arr[], int n)
    {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high)
        {
            // If element is 0, place it on the left side.
            if(arr[mid] == 0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }

            // If element is 2, place it on the right side.
            else if(arr[mid] == 2)
            {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;

                // Do not increment mid because the swapped element
                // from high still needs to be checked.
                high--;
            }

            // If element is 1, it is already in its correct region.
            else
            {
                mid++;
            }
        }

        // Display the sorted array.
        for(int i : arr)
            System.out.print(i + " ");

        return 0;
    }
}

public class SortArray0_1_2
{
    public static void main(String args[])
    {
        int arr[] = {1, 0, 2, 1, 0};

        int n = arr.length;

        SolutionSort ss = new SolutionSort();

        ss.sortArray(arr, n);
    }
}