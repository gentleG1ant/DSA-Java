/*
 * Program: Maximum Subarray Sum - Kadane's Algorithm
 *
 * This program demonstrates three approaches to find the
 * maximum possible sum of a contiguous subarray.
 *
 * 1. Brute-Force Approach
 *    Time Complexity: O(n^3)
 *    Space Complexity: O(1)
 *
 * 2. Better Approach
 *    Time Complexity: O(n^2)
 *    Space Complexity: O(1)
 *
 * 3. Optimal Approach - Kadane's Algorithm
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 *
 * The brute-force and better approaches are kept as commented
 * reference implementations.
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
class Brute
{
    int BruteSubArraySum(int arr[])
    {
        int max = Integer.MIN_VALUE;

        // Select the starting index of the subarray.
        for(int i = 0; i < arr.length; i++)
        {
            // Select the ending index of the subarray.
            for(int j = i; j < arr.length; j++)
            {
                int sum = 0;

                // Calculate the sum of the current subarray.
                for(int k = i; k <= j; k++)
                {
                    sum += arr[k];
                }

                // Update the maximum subarray sum.
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}

public class KadanesAlgo
{
    public static void main(String[] args)
    {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Brute bru = new Brute();

        System.out.println(
            "Maximum sum of the possible subarray = "
            + bru.BruteSubArraySum(arr)
        );
    }
}
*/


// ============================================================
// Better Approach
// ============================================================

/*
class Better
{
    int BetterSubArraySum(int arr[])
    {
        int max = Integer.MIN_VALUE;

        // Select the starting index.
        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;

            // Extend the subarray one element at a time.
            for(int j = i; j < arr.length; j++)
            {
                // Add the current element to the running sum.
                sum += arr[j];

                // Update maximum sum.
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}

public class KadanesAlgo
{
    public static void main(String[] args)
    {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Better better = new Better();

        System.out.println(
            "Maximum sum of the possible subarray = "
            + better.BetterSubArraySum(arr)
        );
    }
}
*/


// ============================================================
// Optimal Approach - Kadane's Algorithm
// ============================================================

class Optimal
{
    /*
     * Kadane's Algorithm:
     *
     * We maintain a running sum of the current subarray.
     *
     * If the running sum becomes negative, it cannot help
     * a future subarray, so we discard it and start again.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    int OptimalSubArraySum(int arr[])
    {
        // Start with the first element so that
        // arrays containing only negative values are handled.
        int max = arr[0];

        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            /*
             * If the previous subarray sum became negative,
             * start a new subarray from the current index.
             */
            if(sum < 0)
            {
                sum = 0;
            }

            // Add the current element to the running sum.
            sum += arr[i];

            // Update the maximum sum found so far.
            max = Math.max(max, sum);
        }

        return max;
    }
}

public class KadanesAlgo
{
    public static void main(String[] args)
    {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Optimal op = new Optimal();

        System.out.println(
                "Maximum sum of the possible subarray = "
                        + op.OptimalSubArraySum(arr)
        );
    }
}