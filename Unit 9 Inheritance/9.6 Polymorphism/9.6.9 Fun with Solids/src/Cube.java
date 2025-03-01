public class Cube extends RectangularPrism
{
    public Cube(String name, double sideLength)
    {
        super(name, sideLength, sideLength, sideLength);
    }

    @Override
    public String toString()
    {
        return "Cube " + getName() + " has a volume of " + volume() + " and surface area of " + surfaceArea();
    }
}