public class BaseballPlayer
{
    private int hits;
    private int walks;
    private int atBats;
    private String name;
    
    //Add constructor here
    public BaseballPlayer(String playerName, int numHits, int numWalks, int bats)
    {
        name = playerName;
        hits = numHits;
        walks = numWalks;
        atBats = bats;
    }
    
    public void printBattingAverage()
    {
        double battingAverage = hits / (double) atBats;
        System.out.println(battingAverage);
    }
    
    public void printOnBasePercentage() {
        double obp = (double) (hits + walks) / (atBats + walks);
        System.out.println(obp);
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
}