
public class Cylinder extends Solid
{
    private double radius;
    private double height;

    public Cylinder(String name, double radius, double height)
    {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume()
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double surfaceArea()
    {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString()
    {
        return "Cylinder " + getName() + " has a volume of " + volume() + " and surface area of " + surfaceArea();
    }
}