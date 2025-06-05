public class PrintOdd 
{
    public static void main(String[] args)
    {
        // Using the key word new int[] is an optional way
        // to create a new array. It forces Java to make a
        // distinct array.
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
        printOddIndices(oddIndexArray);
    }
    
    public static void printOddIndices(int[] arr)
    {
        // your code goes here!
        for(int i = 0; i < arr.length; i++)
        {
            if(i%2 == 1)
            {
                System.out.println(arr[i]);
            }
        }
    }
}