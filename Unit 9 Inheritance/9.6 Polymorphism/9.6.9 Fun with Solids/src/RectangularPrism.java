public class RectangularPrism extends Solid
{
    private double length;
    private double width;
    private double height;

    public RectangularPrism(String name, double length, double width, double height)
    {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double volume()
    {
        return length * width * height;
    }

    @Override
    public double surfaceArea()
    {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public String toString()
    {
        return "Rectangular Prism " + getName() + " has a volume of " + volume() + " and surface area of " + surfaceArea();
    }
}