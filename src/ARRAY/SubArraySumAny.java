import java.util.*;

class SolutionSubArraySumAny
{
    int solution(int arr[], int n, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int max = 0;

        for(int i = 0; i < n; i++)
        {
            // Calculate the current prefix sum.
            sum += arr[i];

            // If prefix sum itself is k,
            // subarray from index 0 to i has sum k.
            if(sum == k)
            {
                max = i + 1;
            }

            // If previous prefix sum = sum - k,
            // then the elements between that index and i
            // have sum equal to k.
            else if(map.containsKey(sum - k))
            {
                max = Math.max(max, i - map.get(sum - k));
            }

            // Store the first occurrence of the prefix sum.
            // First occurrence gives the maximum possible length.
            else
            {
                map.put(sum, i);
            }
        }

        return max;
    }
}

public class SubArraySumAny
{
    public static void main(String[] args)
    {
        int arr[] = {9, -3, 3, 1, 6, -5};

        int n = arr.length;

        SolutionSubArraySumAny ob = new SolutionSubArraySumAny();

        System.out.println("Required maximum length = " + ob.solution(arr, n, 5));
    }
}