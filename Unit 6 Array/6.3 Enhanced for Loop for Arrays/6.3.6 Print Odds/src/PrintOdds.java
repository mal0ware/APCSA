public class PrintOdds
{
   public static void main(String[] args)
   {
        int[] testValues = {17, 34, 56, 2, 19, 100};
        
        printOdds(testValues);
   }
   
   public static void printOdds(int[] nums)
   {
        // write your code here
        for(int num : nums)
        {
             if (num%2 == 1)
             {
                  System.out.println(num);
             }
        }
   }
}