import java.util.*;

class SolutionUnion
{
    List<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        List<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        // Compare elements from both arrays.
        while(i < n && j < m)
        {
            if(arr1[i] < arr2[j])
            {
                // Add only if the element is not already present.
                if(union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);

                i++;
            }

            else if(arr2[j] < arr1[i])
            {
                // Add only if the element is not already present.
                if(union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);

                j++;
            }

            else
            {
                // Both elements are equal, so add only once.
                if(union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);

                i++;
                j++;
            }
        }

        // Add remaining elements of arr1.
        while(i < n)
        {
            if(union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);

            i++;
        }

        // Add remaining elements of arr2.
        while(j < m)
        {
            if(union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);

            j++;
        }

        return union;
    }
}

public class UnionSortedArray
{
    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        int n = arr1.length;
        int m = arr2.length;

        SolutionUnion s = new SolutionUnion();

        List<Integer> res = s.findUnion(arr1, arr2, n, m);

        // Display the union.
        for(int i : res)
            System.out.print(i + " ");
    }
}