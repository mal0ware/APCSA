import java.util.*;

public class AssignmentRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Assignment> assignments = new ArrayList<>();

        while (true) {
            System.out.print("Please enter an assignment name (exit to quit): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Please enter the available points: ");
            double availablePoints = scanner.nextDouble();
            System.out.print("Please enter the earned points: ");
            double earnedPoints = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Is this a (t)est or (p)roject: ");
            String type = scanner.nextLine().trim().toLowerCase();

            if (type.equals("t")) {
                System.out.print("Please enter the test date: ");
                String testDate = scanner.nextLine();
                assignments.add(new Test(name, availablePoints, earnedPoints, testDate));
            } else if (type.equals("p")) {
                System.out.print("Please enter the due date: ");
                String dueDate = scanner.nextLine();
                System.out.print("Group project? true or false: ");
                boolean groups = scanner.nextBoolean();
                scanner.nextLine(); // Consume newline
                assignments.add(new Project(name, availablePoints, earnedPoints, dueDate, groups));
            }
        }

        System.out.println("Your average: " + average(assignments));
        scanner.close();
    }

    public static double average(ArrayList<Assignment> assignments) {
        double totalEarned = 0;
        double totalAvailable = 0;

        for (Assignment a : assignments) {
            totalEarned += a.getEarnedPoints();
            totalAvailable += a.getAvailablePoints();
        }

        return (totalAvailable == 0) ? 0 : (totalEarned / totalAvailable) * 100;
    }
}