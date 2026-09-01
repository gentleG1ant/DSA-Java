/*
 * Program: Count Subarrays With Sum K
 *
 * Description:
 * Given an array and an integer k, find the number of
 * subarrays whose sum is exactly equal to k.
 *
 * Example:
 * Input:
 * Array = {3, 1, 2, 4}
 * k = 6
 *
 * Subarrays with sum 6:
 * {3, 1, 2}
 * {2, 4}
 *
 * Output: 2
 *
 * Three approaches are included:
 *
 * 1. Brute-Force Approach
 *    Uses three loops to generate every subarray and calculate
 *    its sum.
 *
 *    Time Complexity: O(n^3)
 *    Space Complexity: O(1)
 *
 * 2. Better Approach
 *    Removes the innermost loop by continuously maintaining
 *    the sum while extending the subarray.
 *
 *    Time Complexity: O(n^2)
 *    Space Complexity: O(1)
 *
 * 3. Optimal Approach
 *    Uses Prefix Sum and HashMap.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(n)
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
class SubArraySumBrute
{
    int findSum(int arr[], int k)
    {
        int count = 0;

        // Select the starting index.
        for(int i = 0; i < arr.length; i++)
        {
            // Select the ending index.
            for(int j = i; j < arr.length; j++)
            {
                int sum = 0;

                // Calculate the sum from i to j.
                for(int s = i; s <= j; s++)
                {
                    sum += arr[s];
                }

                // Check whether the subarray sum is k.
                if(sum == k)
                    count++;
            }
        }

        return count;
    }
}

public class NsubArraySum
{
    public static void main(String[] args)
    {
        int arr[] = {3, 1, 2, 4};
        int k = 6;

        SubArraySumBrute ob = new SubArraySumBrute();

        System.out.println("Number of subarrays = " + ob.findSum(arr, k));
    }
}
*/


// ============================================================
// Better Approach
// ============================================================

/*
class SubArraySumBetter
{
    int findSum(int arr[], int k)
    {
        int count = 0;

        // Select the starting index.
        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;

            // Extend the subarray towards the right.
            for(int j = i; j < arr.length; j++)
            {
                // Add the newly included element.
                sum += arr[j];

                // Check whether the current subarray sum is k.
                if(sum == k)
                    count++;
            }
        }

        return count;
    }
}

public class NsubArraySum
{
    public static void main(String[] args)
    {
        int arr[] = {3, 1, 2, 4};
        int k = 6;

        SubArraySumBetter ob = new SubArraySumBetter();

        System.out.println("Number of subarrays = " + ob.findSum(arr, k));
    }
}
*/


// ============================================================
// Optimal Approach - Prefix Sum + HashMap
// ============================================================

import java.util.*;

class SubArraySumOptimal
{
    int findSum(int arr[], int k)
    {
        int prefixSum = 0;
        int count = 0;

        /*
         * Stores:
         *
         * Key   -> Prefix Sum
         * Value -> Number of times that prefix sum has occurred
         */
        Map<Integer, Integer> map = new HashMap<>();

        /*
         * Prefix sum 0 is present once before the array begins.
         *
         * This handles cases where the subarray itself
         * starts from index 0.
         */
        map.put(0, 1);

        // Traverse the array once.
        for(int i = 0; i < arr.length; i++)
        {
            // Add current element to the prefix sum.
            prefixSum += arr[i];

            /*
             * We need a previous prefix sum such that:
             *
             * currentPrefixSum - previousPrefixSum = k
             *
             * Therefore:
             *
             * previousPrefixSum = currentPrefixSum - k
             */
            int remove = prefixSum - k;

            /*
             * If this prefix sum existed earlier,
             * then a subarray with sum k exists.
             *
             * The frequency tells us how many such
             * subarrays end at the current index.
             */
            if(map.containsKey(remove))
            {
                count += map.get(remove);
            }

            /*
             * Store the current prefix sum.
             *
             * If it already exists, increase its frequency.
             * Otherwise, store it with frequency 1.
             */
            map.put(
                    prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }
}

public class NsubArraySum
{
    public static void main(String[] args)
    {
        int arr[] = {3, 1, 2, 4};
        int k = 6;

        SubArraySumOptimal ob = new SubArraySumOptimal();

        int result = ob.findSum(arr, k);

        System.out.println("Number of subarrays = " + result);
    }
}