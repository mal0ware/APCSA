public class Ship
{
    private int row = -1;       //- What row location is the ship at?
    private int col = -1;       //- What column location is the ship at?
    private int length = -1;    //- How long is this ship?
    private int direction = -1; //- Is this ship vertical or horizontal?
    private static final int UNSET = -1;
    private static final int HORIZONTAL = 0;
    private static final int VERTICAL = 1;

    // Constructor. Create a ship and set the length.
    public Ship(int length){
        this.length = length;
    }

    // Has the location been initialized
    public boolean isLocationSet(){
        if(row!= -1 && col != -1){
            return true;
        }
        return false;
    }
    // Has the direction been initialized
    public boolean isDirectionSet(){
        if(direction != -1){
            return true;
        }
        return false;
    }
  
    // Set the location of the ship 
    public void setLocation(int row, int col){
        this.row = row;
        this.col = col;
    }

    // Set the direction of the ship
    public void setDirection(int direction){
        this.direction = direction;
    }

    // Getter for the row value
    public int getRow(){
        return row;
    }

    // Getter for the column value
    public int getCol(){
        return col;
    }

    // Getter for the length of the ship
    public int getLength(){
        return length;
    }

    // Getter for the direction
    public int getDirection(){
        return direction;
    }

    // Helper method to get a string value from the direction
    private String directionToString(){
        if(direction == HORIZONTAL){
            return "horizontal";
        }

        if(direction == VERTICAL){
            return "vertical";
        }
        return "unset direction";
    }

    // Helper method to get a (row, col) string value from the location
    private String locationToString(){
        if(row != -1 && col != -1){
            return "(" + row + ", " + col + ")";
        }
        return "(unset location)";
    }

    // toString value for this Ship
    public String toString(){
        return directionToString() + " ship of length " + getLength() + " at " + locationToString();
    }
}