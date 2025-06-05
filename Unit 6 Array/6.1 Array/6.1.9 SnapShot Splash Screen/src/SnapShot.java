public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] welcome = {"Welcome to", "the snap shot", "app!"};
        for (String line : welcome)
        {
            System.out.println(line);
        }
        System.out.println();
        welcome[0] = "Upgrade to";
        welcome[2] = "premium app!";

        for (String line : welcome)
        {
            System.out.println(line);
        }
    }
}