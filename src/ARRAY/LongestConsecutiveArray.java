/*
 * Program: Longest Consecutive Sequence in an Array
 *
 * Description:
 * Finds the length of the longest sequence of consecutive
 * integers present in an array.
 *
 * Example:
 * Input:  {100, 4, 200, 1, 3, 2}
 * Output: 4
 *
 * Longest consecutive sequence:
 * 1, 2, 3, 4
 *
 * Three approaches are included:
 *
 * 1. Brute-Force Approach
 *    Uses Linear Search for every consecutive element.
 *
 *    Time Complexity: O(n^2)
 *    Space Complexity: O(1)
 *
 * 2. Better Approach
 *    Sorts the array and finds consecutive elements.
 *
 *    Time Complexity: O(n log n)
 *    Space Complexity: O(1) auxiliary space
 *
 * 3. Optimal Approach
 *    Uses a HashSet to achieve constant-time average lookup.
 *
 *    Time Complexity: O(n) average
 *    Space Complexity: O(n)
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
import java.util.*;

class SolutionLongestConsecutiveArray
{
    // Performs Linear Search for the given number.
    boolean linearSearch(int arr[], int n)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(n == arr[i])
                return true;
        }

        return false;
    }

    // Finds the longest consecutive sequence.
    int findLargestConsecutive(int nums[])
    {
        int max = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int count = 0;
            int n = nums[i];

            // Keep checking whether the next consecutive
            // number exists in the array.
            while(linearSearch(nums, n))
            {
                n++;
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}

public class LongestConsecutiveArray
{
    public static void main(String[] args)
    {
        int arr[] = {100, 4, 200, 1};

        SolutionLongestConsecutiveArray slca =
                new SolutionLongestConsecutiveArray();

        System.out.println(slca.findLargestConsecutive(arr));
    }
}
*/


// ============================================================
// Better Approach
// ============================================================

/*
import java.util.*;

class SolutionLongestConsecutiveArray
{
    int findLargestConsecutive(int nums[])
    {
        // Sort the array first.
        Arrays.sort(nums);

        int max = 1;
        int count = 1;

        // Start with the first element.
        int previous = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            // If the current element is consecutive.
            if(nums[i] == previous + 1)
            {
                count++;
                previous = nums[i];
            }

            // Ignore duplicate elements.
            else if(nums[i] == previous)
            {
                continue;
            }

            // A new sequence starts.
            else
            {
                count = 1;
                previous = nums[i];
            }

            max = Math.max(max, count);
        }

        return max;
    }
}

public class LongestConsecutiveArray
{
    public static void main(String[] args)
    {
        int arr[] = {100, 4, 200, 1, 3, 2};

        SolutionLongestConsecutiveArray slca =
                new SolutionLongestConsecutiveArray();

        System.out.println(slca.findLargestConsecutive(arr));
    }
}
*/


// ============================================================
// Optimal Approach
// ============================================================

import java.util.*;

class SolutionLongestConsecutiveArray
{
    int findLargestConsecutive(int nums[])
    {
        /*
         * Store all elements in a HashSet.
         *
         * HashSet provides O(1) average-time lookup.
         * It also automatically removes duplicate elements.
         */
        Set<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            set.add(num);
        }

        int max = 0;

        /*
         * Check every element as a possible starting point.
         *
         * An element is a starting point only when
         * (element - 1) is NOT present in the set.
         */
        for(int start : set)
        {
            if(!set.contains(start - 1))
            {
                int current = start;
                int count = 1;

                /*
                 * Keep moving forward while consecutive
                 * elements are present.
                 */
                while(set.contains(current + 1))
                {
                    current++;
                    count++;
                }

                // Update the longest sequence found so far.
                max = Math.max(max, count);
            }
        }

        return max;
    }
}

public class LongestConsecutiveArray
{
    public static void main(String[] args)
    {
        int arr[] = {100, 4, 200, 1, 3, 2};

        SolutionLongestConsecutiveArray slca =
                new SolutionLongestConsecutiveArray();

        System.out.println(
                "Longest consecutive sequence length = "
                        + slca.findLargestConsecutive(arr)
        );
    }
}