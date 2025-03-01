import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        
        System.out.println(factorial(number));
    }
    
    public static int factorial(int x) {
        // Base case: factorial of 0 or 1 is 1
        if (x == 0 || x == 1) {
            return 1;
        }
        // Recursive call: x * factorial of (x-1)
        return x * factorial(x - 1);
    }
}