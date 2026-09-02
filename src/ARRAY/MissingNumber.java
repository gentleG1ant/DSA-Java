/*
 * Program: Find the Missing Number
 *
 * Description:
 * Given an array containing n-1 numbers from the range 1 to n,
 * find the one missing number.
 *
 * Example:
 * Input:  {8, 2, 4, 5, 3, 7, 1}
 * Output: 6
 *
 * Three approaches are included:
 *
 * 1. Brute-Force Approach
 *    For every number from 1 to n, perform Linear Search.
 *
 *    Time Complexity: O(n^2)
 *    Space Complexity: O(1)
 *
 * 2. Better Approach
 *    Uses the mathematical sum formula:
 *    Sum = n * (n + 1) / 2
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 *
 * 3. Optimal Approach
 *    Uses XOR properties to avoid possible integer overflow
 *    that can occur with the sum approach.
 *
 *    Time Complexity: O(n)
 *    Space Complexity: O(1)
 */


// ============================================================
// Brute-Force Approach
// ============================================================

/*
class SolutionBrute
{
    int findNum(int arr[])
    {
        // Array contains n-1 elements,
        // so the complete range contains n elements.
        int n = arr.length + 1;

        // Check every number from 1 to n.
        for(int i = 1; i <= n; i++)
        {
            boolean found = false;

            // Search for the current number in the array.
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] == i)
                {
                    found = true;
                    break;
                }
            }

            // If the number is not found, it is missing.
            if(!found)
                return i;
        }

        return -1;
    }
}

public class MissingNumber
{
    public static void main(String[] args)
    {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};

        SolutionBrute sb = new SolutionBrute();

        System.out.println("Missing number = " + sb.findNum(arr));
    }
}
*/


// ============================================================
// Better Approach - Sum Formula
// ============================================================

/*
class SolutionBetter
{
    int findNum(int arr[])
    {

         // Since one number is missing,
         //n = arr.length + 1.

int n = arr.length + 1;

int actualSum = 0;

// Calculate the sum of elements present in the array.
        for(int i = 0; i < arr.length; i++)
        {
actualSum += arr[i];
        }


 * Calculate the expected sum of numbers from 1 to n.
 *
 * Formula:
 * n * (n + 1) / 2
int expectedSum = n * (n + 1) / 2;

// Difference gives the missing number.
        return expectedSum - actualSum;
    }
            }

public class MissingNumber
{
    public static void main(String[] args)
    {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};

        SolutionBetter sb = new SolutionBetter();

        System.out.println("Missing number = " + sb.findNum(arr));
    }
}
*/


// ============================================================
// Optimal Approach - XOR
// ============================================================

class SolutionOptimal
{
    int findNum(int arr[])
    {
        /*
         * n is the maximum number in the complete range.
         *
         * Example:
         * Array length = 7
         * Complete range = 1 to 8
         */
        int n = arr.length;

        int xorArray = 0;
        int xorRange = 0;

        /*
         * XOR all elements of the array.
         *
         * At the same time, XOR all numbers from 1 to n.
         */
        for(int i = 0; i < arr.length; i++)
        {
            // XOR of array elements.
            xorArray = xorArray ^ arr[i];

            // XOR of numbers from 1 to n.
            xorRange = xorRange ^ (i + 1);
        }

        /*
         * Include n + 1 because the complete range
         * actually goes from 1 to n + 1.
         */
        xorRange = xorRange ^ (n + 1);

        /*
         * Equal numbers cancel each other because:
         *
         * x ^ x = 0
         *
         * Therefore, only the missing number remains.
         */
        return xorArray ^ xorRange;
    }
}

public class MissingNumber
{
    public static void main(String[] args)
    {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};

        SolutionOptimal so = new SolutionOptimal();

        int result = so.findNum(arr);

        System.out.println("Missing number = " + result);
    }
}