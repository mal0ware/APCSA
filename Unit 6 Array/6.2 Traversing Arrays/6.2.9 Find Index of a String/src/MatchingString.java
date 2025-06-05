public class MatchingString
{
    
    public static int findString(String[] myArray, String myString)
    {
        // your code goes here
        int i = 0;
        for(String line : myArray)
        {
            if(line.equals(myString))
            {
                return i;
            }
            i++;
        }
        return -1;
    }
}