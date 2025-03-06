public class Grid {
    private Location[][] grid;

    // Constants for number of rows and columns.
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;

    // Create a new Grid. Initialize each Location in the grid to be a new Location object.
    public Grid() {
        grid = new Location[NUM_ROWS][NUM_COLS];
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                grid[i][j] = new Location();
            }
        }
    }

    // Mark a hit in this location by calling the markHit method on the Location object.
    public void markHit(int row, int col) {
        grid[row][col].markHit();
    }

    // Mark a miss on this location.
    public void markMiss(int row, int col) {
        grid[row][col].markMiss();
    }

    // Set the status of this location object.
    public void setStatus(int row, int col, int status) {
        grid[row][col].setStatus(status);
    }

    // Get the status of this location in the grid.
    public int getStatus(int row, int col) {
        return grid[row][col].getStatus();
    }

    // Return whether or not this Location has already been guessed.
    public boolean alreadyGuessed(int row, int col) {
        return grid[row][col].checkHit() || grid[row][col].checkMiss();
    }

    // Set whether or not there is a ship at this location to the val.
    public void setShip(int row, int col, boolean val) {
        grid[row][col].setShip(val);
    }

    // Return whether or not there is a ship here.
    public boolean hasShip(int row, int col) {
        return grid[row][col].hasShip();
    }

    // Get the Location object at this row and column position.
    public Location get(int row, int col) {
        return grid[row][col];
    }

    // Return the number of rows in the Grid.
    public int numRows() {
        return NUM_ROWS;
    }

    // Return the number of columns in the grid.
    public int numCols() {
        return NUM_COLS;
    }

    // Print the Grid status including a header at the top that shows column numbers 1-10.
    // If there is no guess, print a '-'.
    // If it was a miss, print 'O'.
    // If it was a hit, print 'X'.
    public void printStatus() {
        //System.out.print("  ");
        for (int i = 1; i <= NUM_COLS; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        char rowLabel = 'A';
        for (int i = 0; i < NUM_ROWS; i++) {
            System.out.print(rowLabel++ + " ");
            for (int j = 0; j < NUM_COLS; j++) {
                if (grid[i][j].checkHit()) {
                    System.out.print("X ");
                } else if (grid[i][j].checkMiss()) {
                    System.out.print("O ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    // Print the grid and whether there is a ship at each location.
    // If there is no ship, print a '-'. If there is a ship, print 'X'.
    public void printShips() {
        //System.out.print("  ");
        for (int i = 1; i <= NUM_COLS; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        char rowLabel = 'A';
        for (int i = 0; i < NUM_ROWS; i++) {
            System.out.print(rowLabel++ + " ");
            for (int j = 0; j < NUM_COLS; j++) {
                if (grid[i][j].hasShip()) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public void addShip(Ship s){
        for(int i = 0; i < s.getLength(); i++){
            if(s.getDirection() == 1){
                grid[s.getRow()+i][s.getCol()].setShip(true);
            }
            else if(s.getDirection() == 0){
                grid[s.getRow()][s.getCol()+i].setShip(true);
            }
            else{
                System.out.println("INVALID PARAMETER");
            }
        }
    }
}