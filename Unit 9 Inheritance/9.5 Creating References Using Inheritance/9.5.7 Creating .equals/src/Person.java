public class Person {

    private String name;
    private String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    // Equals method to compare name and birthday
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if same reference

        Person other = (Person) obj; // Cast obj to Person
        return this.name.equals(other.name) && this.birthday.equals(other.birthday); // Compare name and birthday
    }
}