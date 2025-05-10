import java.util.ArrayList;

public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<>();

    // Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }

    // Method to add a musician to the top 10 list
    public void add(Musician artist)
    {
        if (artist.isEligible())
        { // Check if the musician is eligible
            if (top10.size() < 10)
            {
                top10.add(artist); // Add directly if less than 10 musicians
            }
            else
            {
                replace(artist); // Call replace if the list is full
            }
        }
        else
        {
            System.out.println("Sorry, " + artist.getName() + " does not qualify for Top 10");
        }
    }

    // Method to replace a musician in the top 10 list
    private void replace(Musician artist)
    {
        int minIndex = 0;
        int minAlbumsSold = top10.get(0).getAlbumsSold();

        // Find the musician with the lowest albums sold
        for (int i = 1; i < top10.size(); i++)
        {
            if (top10.get(i).getAlbumsSold() < minAlbumsSold)
            {
                minIndex = i;
                minAlbumsSold = top10.get(i).getAlbumsSold();
            }
        }

        // Replace if the new musician has sold more albums
        if (artist.getAlbumsSold() > minAlbumsSold)
        {
            System.out.println("The musician " + top10.get(minIndex).getName() + " has been replaced by " + artist.getName() + ".");
            top10.set(minIndex, artist);
        }
        else
        {
            System.out.println("Sorry, " + artist.getName() + " has less albums sold than the other musicians.");
        }
    }
}