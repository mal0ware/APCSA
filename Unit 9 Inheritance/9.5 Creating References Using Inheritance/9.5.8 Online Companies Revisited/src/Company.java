public class Company {
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    // Constructor for only name (online company case)
    public Company(String name) {
        this.name = name;
        this.streetAddress = null;
        this.city = null;
        this.state = null;
    }

    // Constructor for full address
    public Company(String name, String streetAddress, String city, String state) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String address() {
        if (streetAddress == null) {
            return "";
        }
        return streetAddress + "\n" + city + ", " + state;
    }

    @Override
    public String toString() {
        return name + "\n" + address();
    }
}