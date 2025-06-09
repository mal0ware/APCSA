public class ActivityTracker
{
    public static void main(String[] args)
    {
        ActivityLog mylog = new ActivityLog(); //creates new ActivityLog object called "mylog"
        
        mylog.addMiles(5); //adds 5 miles to numMiles of myLog
        mylog.addHours(1); // adds 1 hour to numHours
        
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles()); //prints numMiles of mylog
        
        double hoursToday = mylog.getHours(); //initializes hoursToday with numHours of mylog
        
        mylog.addHours(1.5); //adds 1.5 hours to numHours
        mylog.addHours(3); // adds 3 hours to numHours
        
        double increase = mylog.getHours() - hoursToday; //initializes increase with numHours-hoursToday
        
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}