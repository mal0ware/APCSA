import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        
        // Modify this code from the example
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        int counter1 = selectionSort(array1);
        // sort second array
        int counter2 = selectionSort(array2);

        // Change these print statements to print out the number of swaps
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("First array swaps: " + counter1);
        System.out.println("Second array swaps: " + counter2);
    }
    
    /*
     * Selection sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    public static int selectionSort(int[] arr)
    {
        int counter = 0;
        int currentMinIndex;
        for (int i = 0; i < arr.length - 1; i++)
        {
            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
            
            // swap numbers if needed
            if (i != currentMinIndex)
            {
                int temp = arr[currentMinIndex];
                arr[currentMinIndex] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
        
        // Print out the sorted arr
        
        return counter;
    }
}