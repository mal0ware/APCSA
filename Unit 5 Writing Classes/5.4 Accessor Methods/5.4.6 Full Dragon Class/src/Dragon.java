public class Dragon 
{
    private int level;
    private String attack;
    
    
    // Write the constructor here!
    public Dragon(String theAttack, int theLevel)
    {
        attack = theAttack;
        level = theLevel;
    }
    
    // Put getters here
    public String getAttack()
    {
        return attack;
    }
    public int getLevel()
    {
            return level;
    }
    // Put other methods here
    public String melee()
    {
        String bigAttack = "";
        for(int i = 0; i < level; i++)
        {
            bigAttack+=attack;
        }
        return bigAttack;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}