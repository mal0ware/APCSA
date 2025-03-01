
public class Pyramid extends Solid
{
    private double length;
    private double width;
    private double height;

    public Pyramid(String name, double length, double width, double height)
    {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double volume()
    {
        return (length * width * height) / 3;
    }

    @Override
    public double surfaceArea() {
        double baseArea = length * width;
        double slantHeight1 = Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
        double slantHeight2 = Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2));
        double lateralArea = (length * slantHeight1) + (width * slantHeight2);
        return baseArea + lateralArea;
    }



    @Override
    public String toString()
    {
        return "Pyramid " + getName() + " has a volume of " + volume() + " and surface area of " + surfaceArea();
    }
}