public class Chef
{
    private String name;
    private String restaurant;
    private Meal best;

    public Chef(String chefName, String theRestaurant, Meal bestMeal)
    {
        name = chefName;
        restaurant = theRestaurant;
        best = bestMeal;
    }
    public String getName()
    {
        return name;
    }
    public String getRestaurant()
    {
        return restaurant;
    }
    public String getBestMealName()
    {
        return best.getName();
    }
    public int getBestMealServings()
    {
        return best.getNumberOfServings();
    }
    public String getBestMealCourse()
    {
        return best.getCourse();
    }

    public String toString()
    {
        return "Chef "+name+" works at "+restaurant+" and is best known for "+best;
    }
}