import java.util.*;

public class CompareSearch 
{
    public static void main(String[] args)
    {
        System.out.println("Table of comparison counts");
        System.out.println("Length\t\tBinary Search\tLinear Search");
        testArrayOfLength(10);
        testArrayOfLength(20);
        testArrayOfLength(50);
        testArrayOfLength(100);
        testArrayOfLength(200);
    }
    
    public static void testArrayOfLength(int length)
    {
        int[] arr = generateArrayOfLength(length);
        int index = (int)(Math.random() * length);
        int elem = arr[index];
        System.out.println(length + "\t\t" + binarySearch(arr, elem) + "\t\t" + linearSearch(arr, elem));
    }
    
    public static int[] generateArrayOfLength(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }
        
        Arrays.sort(arr);
        
        return arr;
    }
    
    // Modified binary search to count the number of comparisons
    public static int binarySearch(int[] array, int number)
    {
        int low = 0;
        int high = array.length - 1;
        int comparisons = 0; // Counter for comparisons
        
        while (low <= high)
        {
            int mid = (low + high) / 2;
            comparisons++; // Increment comparison counter
            
            if (array[mid] == number)
            {
                return comparisons; // Return the number of comparisons
            }
            else if(array[mid] < number)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
      
        return comparisons; // Return the number of comparisons even if not found
    }
    
    // Modified linear search to count the number of comparisons
    public static int linearSearch(int[] array, int number)
    {
        int comparisons = 0; // Counter for comparisons
        
        for (int i = 0; i < array.length; i++)
        {
            comparisons++; // Increment comparison counter
            if (array[i] == number)
            {
                return comparisons; // Return the number of comparisons
            }
        }
        return comparisons; // Return the number of comparisons even if not found
    }
}