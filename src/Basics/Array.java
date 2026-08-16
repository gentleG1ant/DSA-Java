import java.util.Arrays;

/*
 * Program: Array Basics
 *
 * Demonstrates basic array operations and two ways
 * of traversing an array.
 *
 * Concepts:
 * - Creating arrays
 * - Accessing and updating elements
 * - Array length
 * - Arrays.toString()
 * - for loop
 * - for-each loop
 */

public class Array {

    public static void main(String[] args) {

        // Array created with values.
        String[] arr1 = {"Raj", "Ram", "Shyam"};

        // Array created with a fixed size using new.
        String[] arr2 = new String[3];

        arr2[0] = "Rahul";
        arr2[1] = "Shantanu";
        arr2[2] = "Aman";

        // Printing an array directly does not display its elements.
        System.out.println(arr1);

        // Arrays.toString() displays the array elements.
        System.out.println(Arrays.toString(arr1));

        // Accessing an element using its index.
        System.out.println("First element: " + arr1[0]);

        System.out.println("Second Array: " + Arrays.toString(arr2));

        // Updating an array element.
        arr2[1] = "Raj";

        System.out.println("Length of Array 1: " + arr1.length);
        System.out.println("Updated Second Array: " + Arrays.toString(arr2));

        // Demonstrate array traversal using different loops.
        ArrayLoops.forLoop();
        ArrayLoops.forEachLoop();
    }
}

class ArrayLoops {

    // Calculate the sum using a traditional for loop.
    static void forLoop() {

        int[] numbers = {1, 2, 54, 78, 6};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum using for loop: " + sum);
    }

    // Calculate the sum and print elements using a for-each loop.
    static void forEachLoop() {

        int[] numbers = {1, 2, 54, 78, 6};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum using for-each loop: " + sum);

        String[] names = {"RAJ", "JHON", "SMITH", "SHYAM", "RAHUL", "AMAN"};

        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}