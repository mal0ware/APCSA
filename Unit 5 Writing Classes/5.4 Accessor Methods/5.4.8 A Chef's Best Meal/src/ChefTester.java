public class ChefTester
{
    public static void main(String[] args)
    {
        // Don't modify this part!
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);
        
        System.out.println(alex);
        System.out.println(alex.getBestMealName());
        
        // Create your own Meal and Chef here:
        Meal nutella = new Meal("Nutella Sandwhich", "Breakfast", 2);
        Chef marius = new Chef("Marius", "Home", nutella);

        System.out.println(marius);
    }
}