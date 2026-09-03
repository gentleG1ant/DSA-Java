import java.util.*;

// Optimal Approach
class SolutionRearrangement
{
    int[] rearrangement(int arr[])
    {
        // Positive elements will be placed at even indices.
        int posInd = 0;

        // Negative elements will be placed at odd indices.
        int negInd = 1;

        int ans[] = new int[arr.length];

        // Traverse through the original array.
        for(int el : arr)
        {
            // Place positive element at the next even index.
            if(el > 0)
            {
                ans[posInd] = el;
                posInd += 2;
            }

            // Place negative element at the next odd index.
            else
            {
                ans[negInd] = el;
                negInd += 2;
            }
        }

        return ans;
    }
}

public class SignElementRearrangement
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, -4, -5};

        SolutionRearrangement sol = new SolutionRearrangement();

        int temp[] = sol.rearrangement(arr);

        // Display the rearranged array.
        for(int tem : temp)
            System.out.print(tem + " ");
    }
}import java.util.*;

// Optimal Approach
class SolutionRearrangement
{
    int[] rearrangement(int arr[])
    {
        // Positive elements will be placed at even indices.
        int posInd = 0;

        // Negative elements will be placed at odd indices.
        int negInd = 1;

        int ans[] = new int[arr.length];

        // Traverse through the original array.
        for(int el : arr)
        {
            // Place positive element at the next even index.
            if(el > 0)
            {
                ans[posInd] = el;
                posInd += 2;
            }

            // Place negative element at the next odd index.
            else
            {
                ans[negInd] = el;
                negInd += 2;
            }
        }

        return ans;
    }
}

public class SignElementRearrangement
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, -4, -5};

        SolutionRearrangement sol = new SolutionRearrangement();

        int temp[] = sol.rearrangement(arr);

        // Display the rearranged array.
        for(int tem : temp)
            System.out.print(tem + " ");
    }
}