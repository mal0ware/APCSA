public class Musician
{
    private String name;
    private int weeksInTop40;
    private int albumsSold;
    
    public Musician(String name, int weeksInTop40, int albumsSold)
    {
        this.name = name;
        this.weeksInTop40 = weeksInTop40;
        this.albumsSold = albumsSold;
    }
    
    public boolean isPlatinum()
    {
        return albumsSold >= 1000000;
    }
    
    public boolean isEligible()
    {
        return isPlatinum() && weeksInTop40 >= 100;
    }
    
    public int getAlbumsSold(){
        return albumsSold;
    }
    
    public int getWeeksInTop40()
    {
        return this.weeksInTop40;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String toString()
    {
        return this.name;
    }
}