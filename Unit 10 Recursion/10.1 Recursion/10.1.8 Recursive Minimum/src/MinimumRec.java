import java.util.*;

public class MinimumRec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Please enter numbers. Enter -1 to quit: ");
            int number = input.nextInt();

            if (number == -1) {
                break;
            } else {
                numbers.add(number);
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
        } else {
            int minimum = recMinimum(numbers);
            System.out.println("Minimum: " + minimum);
        }
    }

    public static int recMinimum(ArrayList<Integer> numbers) {
        // Base Case: If there is only one element, return it
        if (numbers.size() == 1) {
            return numbers.get(0);
        }

        // Remove the last element
        int lastElement = numbers.remove(numbers.size() - 1);

        // Recursive call to find the minimum of the remaining list
        int minOfRest = recMinimum(numbers);

        // Return the minimum of the last element and the recursive result
        return Math.min(lastElement, minOfRest);
    }
}