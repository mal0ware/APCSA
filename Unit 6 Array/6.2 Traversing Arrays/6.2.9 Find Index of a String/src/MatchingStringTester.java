public class MatchingStringTester
{
   public static void main(String[] args)
   {
        String[] testArr = {"Hello", "Karel", "CodeHS!", "Karel"};
        // Should print 1
        System.out.println(MatchingString.findString(testArr, "Karel"));
   }
}