public class ElectricCar extends Car {
    // Constructor for ElectricCar class
    public ElectricCar(String model) {
        // Call the parent constructor with model and a default MPG message
        super(model, "Electric cars do not calculate MPG");
    }

    // Override the toString() method
    @Override
    public String toString() {
        return super.getModel() + " is an electric car.";
    }
}