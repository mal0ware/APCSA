public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Override toString to print rectangle details
    @Override
    public String toString() {
        return "A rectangle with a width of " + width + " and a height of " + height;
    }

    // Override equals to compare rectangles by area
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Null or different class
        }
        Rectangle other = (Rectangle) obj;
        return this.width * this.height == other.width * other.height; // Compare areas
    }
}