import java.util.ArrayList;

public class MergeSortCounter {

    private static int count;

    public static void main(String[] args) {
        // Test with arrays of various sizes
        int[] sizes = {100, 1000, 10000, 100000};
        
        // Loop over the sizes, generate a random array, run mergeSort, and print the counter
        for (int size : sizes) {
            // Reset the counter before each sort
            count = 0;
            
            int[] array = makeRandomArray(size);
            mergeSort(array, array.length);
            
            System.out.println("Total Recursive calls for " + size + ": " + count);
        }
    }

    public static void mergeSort(int[] current, int length) {
        // Increment the counter on each call to mergeSort
        count++;
        
        if (length < 2) {
            return;
        }
        
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        
        // Copy data to left and right arrays
        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }

        // Recursively sort both halves
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        // Merge the sorted halves
        merge(current, left, right);
    }

    public static void merge(int[] current, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;

        // Merge the two sorted arrays into current array
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                current[k++] = left[i++];
            } else {
                current[k++] = right[j++];
            }
        }

        // Copy the remaining elements of left array
        while (i < leftSize) {
            current[k++] = left[i++];
        }

        // Copy the remaining elements of right array
        while (j < rightSize) {
            current[k++] = right[j++];
        }
    }

    public static int[] makeRandomArray(int number) {
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<>(number);

        // Create the sorted list
        for (int i = 0; i < number; i++) {
            sorted.add(i);
        }

        // Shuffle the list
        int index = 0;
        while (sorted.size() > 0) {
            int randomIndex = (int) (Math.random() * sorted.size());
            array[index] = sorted.remove(randomIndex);
            index++;
        }

        return array;
    }
}