import java.util.*;

public class CarTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>(); // List to store cars

        while (true) {
            System.out.println("Please enter a car model name(exit to quit): ");
            String model = scanner.nextLine();

            // Check for exit condition
            if (model.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Is this car electric? (y or n) ");
            String isElectric = scanner.nextLine();

            if (isElectric.equalsIgnoreCase("y")) {
                // Create an ElectricCar and add to the list
                ElectricCar electricCar = new ElectricCar(model);
                cars.add(electricCar);
            } else {
                // If not electric, ask for MPG and create a regular Car
                System.out.println("How many miles per gallon: ");
                String mpg = scanner.nextLine();
                Car car = new Car(model, mpg);
                cars.add(car);
            }
        }

        // Display the results
        for (Car car : cars) {
            System.out.println("Car: " + car.getModel());
            System.out.println("MPG: " + car.getMPG());
            System.out.println();
        }
    }
}