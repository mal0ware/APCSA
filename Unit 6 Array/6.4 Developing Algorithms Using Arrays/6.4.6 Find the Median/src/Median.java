import java.util.*;
public class Median
{

    public static void main(String[] args)
    {
        // your code goes here!
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 6 numbers:");

        int[] arr = new int[6];
        int i = 0;
        while (i < 6 && input.hasNextInt())
        {
            arr[i] = input.nextInt();
            i++;
        }
        while(i<6)
        {
            arr[i] = 0;
            i++;
        }
        System.out.println("The median is " + median(arr));
    }

    public static double median(int[] arr)
    {
        // your code goes here!
        Arrays.sort(arr);
        int middle = arr.length / 2;
        if (arr.length%2 ==1)
        {
            return (double)arr[middle];
        }
        else
        {
            return (arr[middle-1] + arr[middle])/2.0;
        }
    }
}