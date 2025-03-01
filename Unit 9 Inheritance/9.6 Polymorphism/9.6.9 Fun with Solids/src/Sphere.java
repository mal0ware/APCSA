import java.lang.Math;

public class Sphere extends Solid
{
    private double radius;

    public Sphere(String name, double radius)
    {
        super(name);
        this.radius = radius;
    }

    @Override
    public double volume()
    {
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea()
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString()
    {
        return "Sphere " + getName() + " has a volume of " + volume() + " and surface area of " + surfaceArea();
    }
}