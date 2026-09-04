// Find the longest subarray having sum equal to 0.

// Brute Method
/*
import java.util.*;

class SubArraySumNegative
{
    int subArray(int arr[], int n)
    {
        int max = 0;

        for(int i = 0; i < n; i++)
        {
            int sum = 0;

            for(int j = i; j < n; j++)
            {
                sum += arr[j];

                if(sum == 0)
                    max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}

public class SubArraySum2Negative
{
    public static void main(String args[])
    {
        int arr[] = {9, -3, 3, -1, 6, -5};

        int n = arr.length;

        SubArraySumNegative sa = new SubArraySumNegative();

        System.out.println("Longest subarray with sum 0: " + sa.subArray(arr, n));
    }
}
*/


// Optimal Approach
// Uses prefix sum and HashMap.
// If the same prefix sum occurs again,
// the elements between those two positions have sum 0.

import java.util.*;

class SolutionSumNegative
{
    int subArray(int arr[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int max = 0;

        for(int i = 0; i < n; i++)
        {
            // Add current element to prefix sum.
            sum += arr[i];

            // If prefix sum is 0,
            // subarray from index 0 to i has sum 0.
            if(sum == 0)
            {
                max = i + 1;
            }

            // If the same prefix sum occurred earlier,
            // the elements between the two positions sum to 0.
            else if(map.containsKey(sum))
            {
                max = Math.max(max, i - map.get(sum));
            }

            // Store the first occurrence of the prefix sum.
            // We keep the first index because it gives
            // the maximum possible subarray length.
            else
            {
                map.put(sum, i);
            }
        }

        return max;
    }
}

public class SubArraySum2Negative
{
    public static void main(String args[])
    {
        int arr[] = {9, -3, 3, -1, 6, -5};

        int n = arr.length;

        SolutionSumNegative ob = new SolutionSumNegative();

        System.out.println("Longest subarray with sum 0: " + ob.subArray(arr, n));
    }
}