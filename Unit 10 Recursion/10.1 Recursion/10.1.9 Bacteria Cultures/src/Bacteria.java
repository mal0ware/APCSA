import java.util.Scanner;

public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        int bacteria = numBacteriaAlive(hours);
        System.out.println("After " + hours + ", there will be " + bacteria);
    }
    
    public static int numBacteriaAlive(int hour)
    {
        // Base case: if no time has passed, we start with 10 bacteria
        if (hour == 0)
            return 10;
        
        // Recursive case: previous count + (previous count * 2)
        return numBacteriaAlive(hour - 1) * 3;
    }
}