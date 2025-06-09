public class ActivityLog
{
    private double numHours;
    private double numMiles;
    /**
    Constructs ActivityLog object with default values.
    Precondition: none
    Postcondition: new ActivityLog object
    */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    

    /**
    Alters the hours of numHours instance variable
    Precondition: Have an ActivityLog object
    Postcondition: numHours of the ActivityLog will be changed
    @param double hours -a double of the hours you would like to change the numHours by
    */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    /**
    Alters the miles of numMiles instance variable
    Precondition: Have an ActivityLog object
    Postcondition: numMiles of the ActivityLog will be changed
    @param double miles -a double of the miles you would like to change the numMiles by
    */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    /**
    Gets the value of numMiles for the user
    Precondition: Have an ActivityLog object that contains a numMiles value
    Postcondition: numMiles will be returned
    */
    public double getMiles()
    {
        return numMiles;
    }
    
    /**
    Gets the value of numHours for the user
    Precondition: Have an ActivityLog object that contains a numHours value
    Postcondition: numHours will be returned
    */
    public double getHours() 
    {
        return numHours;
    }
    
}