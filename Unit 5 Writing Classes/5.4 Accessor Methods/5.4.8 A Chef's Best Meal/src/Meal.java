public class Meal
{
    private String name;
    private String course;
    private int servings;

    public Meal(String theName, String theCourse, int numServings)
    {
        name = theName;
        course = theCourse;
        servings = numServings;
    }
    public String getName()
    {
        return name;
    }
    public String getCourse()
    {
        return course;
    }
    public int getNumberOfServings()
    {
        return servings;
    }
    public String toString()
    {
        return name + " (" + course + ")";
    }
}