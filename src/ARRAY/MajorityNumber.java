/*
 * Program: Majority Element
 *
 * Description:
 * Finds the element that appears more than n/2 times
 * in the given array.
 *
 * Example:
 * Input:  {2, 2, 1, 1, 1, 2, 2}
 * Output: 2
 *
 * Three approaches are included:
 *
 * 1. Brute-Force Approach
 *    Counts the frequency of every element.
 *
 *    Time Complexity: O(n^2)
 *    Space Complexity: O(1)
 *
 * 2. Better Approach
 *    Uses a HashMap to store the frequency of each element.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(n)
 *
 * 3. Optimal Approach
 *    Uses Moore's Voting Algorithm to find a candidate,
 *    followed by a second traversal to verify the candidate.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
class SolutionMajority
{
    int findMajority(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            int count = 0;

            // Count the occurrences of arr[i].
            for(int j = 0; j < n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }

            // Check whether the element occurs more than n/2 times.
            if(count > n / 2)
                return arr[i];
        }

        return -1;
    }
}

public class MajorityNumber
{
    public static void main(String[] args)
    {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};

        int n = arr.length;

        SolutionMajority sm = new SolutionMajority();

        System.out.println(sm.findMajority(arr, n));
    }
}
*/


// ============================================================
// Better Approach
// ============================================================

/*
import java.util.*;

class SolutionMajority
{
    int findMajority(int arr[], int n)
    {
        Map<Integer, Integer> map = new HashMap<>();

        // Store the frequency of every element.
        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check which element occurs more than n/2 times.
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > n / 2)
                return entry.getKey();
        }

        return -1;
    }
}

public class MajorityNumber
{
    public static void main(String[] args)
    {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};

        int n = arr.length;

        SolutionMajority sm = new SolutionMajority();

        System.out.println(sm.findMajority(arr, n));
    }
}
*/


// ============================================================
// Optimal Approach - Moore's Voting Algorithm
// ============================================================

class SolutionMajority
{
    int findMajority(int arr[], int n)
    {
        int count = 0;
        int candidate = 0;

        /*
         * First Pass:
         * Find a possible majority element.
         *
         * If count becomes 0, choose the current element
         * as the new candidate.
         */
        for(int i = 0; i < n; i++)
        {
            if(count == 0)
            {
                candidate = arr[i];
                count = 1;
            }
            else if(candidate == arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        /*
         * Second Pass:
         * Verify whether the candidate actually occurs
         * more than n/2 times.
         */
        int frequency = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == candidate)
                frequency++;
        }

        if(frequency > n / 2)
        {
            System.out.println("Total count = " + frequency);
            return candidate;
        }

        // No majority element exists.
        return -1;
    }
}

public class MajorityNumber
{
    public static void main(String[] args)
    {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};

        int n = arr.length;

        SolutionMajority sm = new SolutionMajority();

        int result = sm.findMajority(arr, n);

        if(result != -1)
            System.out.println("Majority element = " + result);
        else
            System.out.println("No majority element found");
    }
}