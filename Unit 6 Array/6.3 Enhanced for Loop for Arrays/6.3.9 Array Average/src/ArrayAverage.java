public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
     // your code goes here!
     double sum = 0;
     for (int value : values)
     {
        sum += value;
     }
     return sum/values.length;
   }
}