import java.util.ArrayList;

public class PieTester {
    public static void main(String[] args) {
        // Create an ArrayList of Pie objects
        ArrayList<Pie> pies = new ArrayList<>();

        // Add different types of pies
        pies.add(new ApplePie(6));  // Apple Pie with 6 slices
        pies.add(new PumpkinPie(8, true)); // Pumpkin Pie with 8 slices, made with canned pumpkin
        pies.add(new Pie("Blueberry", 5)); // Generic Pie (Blueberry) with 5 slices

        // Loop through and print out the type of each pie
        for (Pie pie : pies) {
            System.out.println("Pie: " + pie.getType());
        }
    }
}