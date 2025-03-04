import java.util.ArrayList; // Import ArrayList class

public class SortTester {

    public static void main(String[] args) {
        int[] testArray;
        long startTime, endTime;
        int arraySize = 50000;

        // Random Array
        testArray = makeRandomArray(arraySize);

        // Record start time
        startTime = System.nanoTime();

        // Sort array using Merge Sort static method
        Sorter.mergeSort(testArray, testArray.length);

        // Record end time
        endTime = System.nanoTime();

        // Print out results
        System.out.println("Random Array: " + (endTime - startTime) + " nanoseconds");

        // Almost Sorted Array
        testArray = makeAlmostSortedArray(arraySize);

        // Record start time
        startTime = System.nanoTime();

        // Sort array using Merge Sort static method
        Sorter.mergeSort(testArray, testArray.length);

        // Record end time
        endTime = System.nanoTime();

        // Print out results
        System.out.println("Almost Sorted Array: " + (endTime - startTime) + " nanoseconds");

        // Reverse Array
        testArray = makeReverseArray(arraySize);

        // Record start time
        startTime = System.nanoTime();

        // Sort array using Merge Sort static method
        Sorter.mergeSort(testArray, testArray.length);

        // Record end time
        endTime = System.nanoTime();

        // Print out results
        System.out.println("Reverse Array: " + (endTime - startTime) + " nanoseconds");
    }

    /**
     * This method returns an array in random order
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number.
     */
    public static int[] makeRandomArray(int number) {
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number); // Declare and initialize ArrayList
        // Create the sorted list
        for (int i = 0; i < number; i++) {
            sorted.add(i);
        }

        // Now shuffle it.
        int index = 0;
        while (sorted.size() > 0) {
            int randomIndex = (int) (Math.random() * sorted.size());
            array[index] = sorted.remove(randomIndex);
            index++;
        }

        return array;
    }

    /**
     * This method returns an array in reverse order starting from the parameter number
     * and going to the value 0.
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number. Index 0 is the value number, and
     * index array.length-1 is 0
     */
    public static int[] makeReverseArray(int number) {
        int[] array = new int[number];
        int counter = number;
        for (int i = 0; i < number; i++) {
            array[i] = counter;
            counter--;
        }
        return array;
    }

    /**
     * This method returns an array that is almost sorted, but the last index
     * and last index-1 are switched.
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number with index array.length - 1
     * and array.length- 2 swapped.
     */
    public static int[] makeAlmostSortedArray(int number) {
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = i + 1;
        }
        int temp = array[array.length - 1];
        array[array.length - 1] = array[array.length - 2];
        array[array.length - 2] = temp;
        return array;
    }
}