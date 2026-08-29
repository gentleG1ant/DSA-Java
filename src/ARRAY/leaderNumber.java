/*
 * Program: Leaders in an Array
 *
 * A leader is an element such that all elements to its right
 * are smaller than it.
 *
 * The rightmost element is always a leader because there is
 * no element to its right.
 *
 * Example:
 * Input:  {1, 2, 5, 3, 1, 2}
 * Output: [5, 3, 2]
 *
 * Two approaches are included:
 *
 * 1. Brute-Force Approach
 *    Compare every element with all elements to its right.
 *
 *    Time Complexity: O(n^2)
 *    Space Complexity: O(n) for the result list
 *
 * 2. Optimal Approach
 *    Traverse the array from right to left and keep track of
 *    the maximum element seen so far.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(n) for the result list
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
import java.util.*;

class SolutionLeaderNumber
{
    ArrayList<Integer> leaders(int arr[])
    {
        ArrayList<Integer> ans = new ArrayList<>();

        // Check every element as a possible leader.
        for(int i = 0; i < arr.length; i++)
        {
            boolean isLeader = true;

            // Compare the current element with
            // every element to its right.
            for(int j = i + 1; j < arr.length; j++)
            {
                // If any element on the right is greater
                // than or equal to the current element,
                // it is not a leader.
                if(arr[j] >= arr[i])
                {
                    isLeader = false;
                    break;
                }
            }

            // If no greater or equal element was found,
            // the current element is a leader.
            if(isLeader)
            {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}

public class leaderNumber
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 5, 3, 1, 2};

        SolutionLeaderNumber sol = new SolutionLeaderNumber();

        ArrayList<Integer> ans = sol.leaders(arr);

        System.out.println("Leaders: " + ans);
    }
}
*/


// ============================================================
// Optimal Approach
// ============================================================

import java.util.*;

class SolutionLeaderNumber
{
    ArrayList<Integer> leaders(int arr[])
    {
        ArrayList<Integer> ans = new ArrayList<>();

        /*
         * Start from the rightmost element.
         *
         * The rightmost element is always a leader because
         * there is no element to its right.
         */
        int rightMax = arr[arr.length - 1];

        ans.add(rightMax);

        /*
         * Traverse from right to left.
         *
         * If the current element is greater than all elements
         * seen so far on its right, it is a leader.
         */
        for(int i = arr.length - 2; i >= 0; i--)
        {
            if(arr[i] > rightMax)
            {
                rightMax = arr[i];

                // Add the current element to the result.
                ans.add(arr[i]);
            }
        }

        /*
         * Since we traversed from right to left, the leaders
         * were added in reverse order.
         *
         * Reverse the list once after the loop.
         */
        Collections.reverse(ans);

        return ans;
    }
}

public class leaderNumber
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 5, 3, 1, 2};

        SolutionLeaderNumber sol = new SolutionLeaderNumber();

        ArrayList<Integer> ans = sol.leaders(arr);

        System.out.println("Leaders: " + ans);
    }
}