package ARRAY;

/*
 * Program: Linear Search
 *
 * Description:
 * Linear Search checks each element of an array one by one
 * until the required element is found.
 *
 * Time Complexity:
 * Best Case  -> O(1)
 * Worst Case -> O(n)
 *
 * Space Complexity:
 * O(1)
 */

public class LinearSearch
{
    public static void main(String[] args)
    {
        int arr[] = {1, 4, 3, 8, 6, 3};

        int find = 3;

        /*
         * Assume that the element is not found.
         * If we find it, this value will be updated.
         */
        int index = -1;

        // Traverse the array from left to right.
        for(int i = 0; i < arr.length; i++)
        {
            // Check whether the current element is the required element.
            if(arr[i] == find)
            {
                index = i;
                break;
            }
        }

        // Check the result after completing the search.
        if(index != -1)
            System.out.println(index + " is the required index");
        else
            System.out.println("Element not found");
    }
}