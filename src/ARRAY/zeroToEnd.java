// Brute Force Approach
// Uses an extra array to store non-zero elements.
/*
class BruteSolution
{
    void moveZeroes(int arr[])
    {
        int j = 0;

        int temp[] = new int[arr.length];

        // Store all non-zero elements in the temporary array.
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                temp[j] = arr[i];
                j++;
            }
        }

        // Copy the elements back to the original array.
        for(int i = 0; i < arr.length; i++)
            arr[i] = temp[i];
    }
}
*/


// Optimal Solution
// Two Pointer Approach

class OptimalSolution
{
        void moveZeroes(int arr[])
        {
                // z stores the index of the first zero.
                int z = -1;

                // Find the first zero.
                for(int i = 0; i < arr.length; i++)
                {
                        if(arr[i] == 0)
                        {
                                z = i;
                                break;
                        }
                }

                // If there is no zero, no rearrangement is required.
                if(z == -1)
                        return;

                // nz searches for the next non-zero element.
                for(int nz = z + 1; nz < arr.length; nz++)
                {
                        if(arr[nz] != 0)
                        {
                                // Swap the non-zero element with the first zero.
                                int temp = arr[nz];
                                arr[nz] = arr[z];
                                arr[z] = temp;

                                // Move the zero pointer forward.
                                z++;
                        }
                }
        }
}

public class zeroToEnd
{
        public static void main(String[] args)
        {
                int array[] = {0, 1, 0, 3, 12, 5, 0, 7, 0, 0};

                OptimalSolution os = new OptimalSolution();

                os.moveZeroes(array);

                // Display the modified array.
                for(int i : array)
                        System.out.print(i + " ");
        }
}