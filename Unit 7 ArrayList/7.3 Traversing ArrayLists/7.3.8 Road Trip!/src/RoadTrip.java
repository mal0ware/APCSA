import java.util.ArrayList;

public class RoadTrip
{
    private ArrayList<GeoLocation> locationsList;

    public RoadTrip()
    {
        this.locationsList = new ArrayList<GeoLocation>();
    }
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation geolocation = new GeoLocation(name, latitude, longitude);
        locationsList.add(geolocation);
    }
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return locationsList.size();
    }
    // Get the total miles of the trip
    public double getTripLength()
    {
        double totalMiles = 0;
        for(int i = 0; i < locationsList.size()-1; i++)
        {
            GeoLocation current = locationsList.get(i);
            GeoLocation next = locationsList.get(i+1);
            totalMiles += current.distanceFrom(next);
        }
        return totalMiles;
    }
    // Return a formatted toString of the trip
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < locationsList.size(); i++)
        {
            GeoLocation location = locationsList.get(i);
            result.append((i + 1) + ". " + location.getName() + " (" + location.getLatitude() + ", " + location.getLongitude() + ")\n");
        }
        return result.toString();

    }

}