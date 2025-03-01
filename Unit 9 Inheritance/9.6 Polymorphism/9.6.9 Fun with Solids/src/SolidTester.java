public class SolidTester
{
    public static void main(String[] args)
    {
        String name;
        double volume;
        double surfaceArea;

        // Pyramid constructor should take name, length, width, height
        Pyramid pyramid = new Pyramid("Pyramid", 1, 3, 5);
        System.out.println(pyramid);

        // Sphere constructor should take name then radius
        Sphere sphere = new Sphere("Sphere", 4);
        System.out.println(sphere);

        // RectangularPrism constructor should take name, 
        // length, width, height in that order
        RectangularPrism rectangularPrism = new RectangularPrism("Rectangular Prism",
            5, 8, 3);
        System.out.println(rectangularPrism);

        // Cylinder constructor should take name, radius, height
        // in that order
        Cylinder cylinder = new Cylinder("Cylinder", 4, 9);
        System.out.println(cylinder);

        // Cube constructor should take name then side length
        Cube cube = new Cube("Cube", 4);
        System.out.println(cube);
    }
}