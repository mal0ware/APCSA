public class Ball {
    private String color;
    
    public Ball(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    // Override the toString method to return the color of the ball
    @Override
    public String toString() {
        return "Color: " + color;
    }
 
    // Override the equals method to compare based on the color field
    public boolean equals(Ball other) {
        if (other == null) {
            return false;
        }
        return this.color.equals(other.color);
    }
 }