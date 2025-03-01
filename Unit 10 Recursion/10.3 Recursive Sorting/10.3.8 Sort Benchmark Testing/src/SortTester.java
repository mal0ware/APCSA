import java.util.ArrayList;

public class SortTester {

    public static void main(String[] args) {
        long startTime, endTime;
        int arraySize = 20000;  // Size of the array to be sorted

        // Create a random array for sorting
        int[] randomArray = makeRandomArray(arraySize);

        // Test Selection Sort
        System.out.println("Running Selection Sort...");
        int[] selectionArray = makeRandomArray(arraySize); // Create a new random array for Selection Sort
        startTime = System.nanoTime();
        Sorter.selectionSort(selectionArray);
        endTime = System.nanoTime();
        System.out.println("Selection Sort: " + (endTime - startTime) + " ns");

        // Test Insertion Sort
        System.out.println("Running Insertion Sort...");
        int[] insertionArray = makeRandomArray(arraySize); // Create a new random array for Insertion Sort
        startTime = System.nanoTime();
        Sorter.insertionSort(insertionArray);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort: " + (endTime - startTime) + " ns");

        // Test Merge Sort
        System.out.println("Running Merge Sort...");
        int[] mergeArray = makeRandomArray(arraySize); // Create a new random array for Merge Sort
        startTime = System.nanoTime();
        Sorter.mergeSort(mergeArray, mergeArray.length);
        endTime = System.nanoTime();
        System.out.println("Merge Sort: " + (endTime - startTime) + " ns");
    }

    /**
     * This method returns an array in random order
     * @param number- the length of the desired random array
     * @return array - returns an array of length number
     */
    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<>(number);

        // Create a sorted list
        for (int i = 0; i < number; i++) {
            sorted.add(i);
        }

        // Shuffle the list randomly
        int index = 0;
        while (sorted.size() > 0) {
            int randomIndex = (int) (Math.random() * sorted.size());
            array[index] = sorted.remove(randomIndex);
            index++;
        }

        return array;
    }
}