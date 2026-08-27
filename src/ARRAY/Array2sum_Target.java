import java.util.*;

/*
 * Program: Two Sum
 *
 * Description:
 * Given an array and a target value, this program checks whether
 * two elements in the array add up to the target.
 *
 * The program demonstrates three approaches:
 *
 * 1. Brute-Force Approach
 *    Checks every possible pair.
 *
 *    Time Complexity: O(n²)
 *    Space Complexity: O(1)
 *
 * 2. HashMap Approach
 *    Stores previously visited elements and checks whether
 *    the required complement already exists.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(n)
 *
 * 3. Sorting + Two-Pointer Approach
 *    Stores each element with its original index, sorts the
 *    values, and uses two pointers.
 *
 *    Time Complexity: O(n log n)
 *    Space Complexity: O(n)
 *
 * Note:
 * The brute-force and HashMap approaches are retained as
 * commented references. The two-pointer approach is active.
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
class SolutionSumBrute
{
    boolean checkSum(int[] arr, int target)
    {
        // Check every possible pair.
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                // Check whether the current pair produces the target.
                if(arr[i] + arr[j] == target)
                {
                    System.out.println(
                        "Indexes are " + i + " and " + j +
                        " with values " + arr[i] +
                        " and " + arr[j]
                    );

                    return true;
                }
            }
        }

        // No valid pair was found.
        return false;
    }
}

public class Array2sum_Target
{
    public static void main(String[] args)
    {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        SolutionSumBrute obj = new SolutionSumBrute();

        boolean found = obj.checkSum(arr, target);

        if(found)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
*/


// ============================================================
// Better Approach: HashMap
// ============================================================

/*
class SolutionSumHashMap
{
    boolean findSum(int[] arr, int target)
    {
        // Stores array values with their original indexes.
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            // The value needed to complete the target.
            int complement = target - arr[i];

            // Check whether the complement was previously seen.
            if(map.containsKey(complement))
            {
                System.out.println(
                    "Indexes are " + map.get(complement) +
                    " and " + i +
                    " with values " + complement +
                    " and " + arr[i]
                );

                return true;
            }

            // Store the current value and its index.
            map.put(arr[i], i);
        }

        // No valid pair was found.
        return false;
    }
}

public class Array2sum_Target
{
    public static void main(String[] args)
    {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        SolutionSumHashMap obj = new SolutionSumHashMap();

        boolean found = obj.findSum(arr, target);

        if(found)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
*/


// ============================================================
// Optimal Approach: Sorting + Two Pointers
// ============================================================

class SolutionSumBetter
{
    boolean isSum(int[] arr, int target)
    {
        /*
         * Each row stores:
         *
         * Column 0 -> Array value
         * Column 1 -> Original index
         */
        int[][] numIndex = new int[arr.length][2];


        // Store every value with its original index.
        for(int i = 0; i < arr.length; i++)
        {
            numIndex[i][0] = arr[i];
            numIndex[i][1] = i;
        }


        /*
         * Sort the 2D array according to the values.
         *
         * a[0] and b[0] represent the array values.
         */
        Arrays.sort(
                numIndex,
                (a, b) -> Integer.compare(a[0], b[0])
        );


        // Two pointers start at both ends.
        int left = 0;
        int right = arr.length - 1;


        while(left < right)
        {
            // Calculate the sum of the two current values.
            int sum = numIndex[left][0] + numIndex[right][0];


            // Target pair found.
            if(sum == target)
            {
                System.out.println(
                        "Indexes are " + numIndex[left][1] +
                                " and " + numIndex[right][1] +
                                " with values " + numIndex[left][0] +
                                " and " + numIndex[right][0]
                );

                return true;
            }


            /*
             * If the sum is greater than the target,
             * move the right pointer to a smaller value.
             */
            else if(sum > target)
            {
                right--;
            }


            /*
             * If the sum is smaller than the target,
             * move the left pointer to a larger value.
             */
            else
            {
                left++;
            }
        }


        // No valid pair was found.
        return false;
    }
}


// ============================================================
// Main Class
// ============================================================

public class Array2sum_Target
{
    public static void main(String[] args)
    {
        int[] arr = {2, 6, 5, 8, 11};

        int target = 14;


        // Create an object of the solution class.
        SolutionSumBetter obj = new SolutionSumBetter();


        // Check whether a valid pair exists.
        boolean found = obj.isSum(arr, target);


        if(found)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}