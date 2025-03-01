import java.util.*;

public class BinarySearch {

    static int count;

    public static void main(String[] args) {
        int[] arraySizes = {50, 500, 5000, 50000};

        for (int size : arraySizes) {
            count = 0; // Reset counter for each test case

            // Generate a random array of the given size
            int[] arr = generateArrayOfLength(size);

            // Select a random target from the array
            int index = (int) (Math.random() * size);
            int target = arr[index];

            // Calculate max iterations (log base 2 of array size)
            int maxIterations = binaryMax(size);

            // Perform binary search to get actual iterations
            binaryRec(arr, target, 0, arr.length - 1);

            // Print the results
            System.out.println("Array Size: " + size);
            System.out.println("Max iterations: " + maxIterations);
            System.out.println("Actual iterations: " + count);
            System.out.println();
        }
    }

    public static int binaryRec(int[] array, int target, int begin, int end) {
        if (begin <= end) {
            int mid = (begin + end) / 2;
            count++; // Increment the number of recursive calls

            if (target == array[mid]) {
                return mid; // Found the element
            }

            if (target < array[mid]) {
                return binaryRec(array, target, begin, mid - 1); // Search in the left half
            }

            if (target > array[mid]) {
                return binaryRec(array, target, mid + 1, end); // Search in the right half
            }
        }
        return -1; // Element not found
    }

    public static int[] generateArrayOfLength(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 100); // Random integers between 0 and 99
        }

        Arrays.sort(arr); // Sorting the array for binary search
        return arr;
    }

    private static int binaryMax(int length) {
        return (int) (Math.log(length) / Math.log(2)) + 1; // Calculate log base 2
    }
}