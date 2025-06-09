public class LastMultipleOfThree
{
    public static void main(String[] args)
    {
        int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
        System.out.print("The following index holds the LAST multiple of 3: " + findMultipleOfThree(numbers1));
    }
    
    public static int findMultipleOfThree(int[] numbers)
    {
        // your code goes here!
        int lastMultipleOfThree = -1;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 3 == 0)
            {
                lastMultipleOfThree = i;
            }
        }
        return lastMultipleOfThree;
    }
}