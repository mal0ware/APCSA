public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        int[] scores = {80, 90, 84, 65 ,88};
        printScores(scores);
        System.out.println();
        scores[1] = 88;
        scores[3] = 76;
        printScores(scores);

    }

    private static void printScores(int[] scores)
    {
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println(scores[i]);
        }
    }
}