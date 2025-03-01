import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number to start:");
        int number = scanner.nextInt();
        
        System.out.println(countdown(number));
        
        scanner.close();
    }
    
    public static String countdown(int number) {
        // Base case
        if (number == 0) {
            return "Blastoff!";
        }
        // Recursive call
        return number + " " + countdown(number - 1);
    }
}