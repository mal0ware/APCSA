public class Player
{
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    private Ship[] ships;
    private Grid myGrid;
    private Grid opponentGrid;

    public Player() {
        ships = new Ship[SHIP_LENGTHS.length];
        for (int i = 0; i < SHIP_LENGTHS.length; i++) {
            ships[i] = new Ship(SHIP_LENGTHS[i]);
        }
        myGrid = new Grid();
        opponentGrid = new Grid();
    }

    public void chooseShipLocation(Ship s, int row, int col, int direction) {
        if (direction != 0 && direction != 1) {
            System.out.println("INVALID PARAMETER");
            return;
        }
        for (Ship ship : ships) {
            if (ship.getRow() == -1 && ship.getCol() == -1) {
                ship.setLocation(row, col);
                ship.setDirection(direction);
                myGrid.addShip(ship);
                return;
            }
        }
        System.out.println("All ships have already been placed.");
    }

    // Print your ships on the grid
    public void printMyShips() {
        myGrid.printShips();
    }

    // Print opponent guesses
    public void printOpponentGuesses() {
        myGrid.printStatus();
    }

    // Print your guesses
    public void printMyGuesses() {
        opponentGrid.printStatus();
    }

    // Record a guess from the opponent
    public boolean recordOpponentGuess(int row, int col) {
        if (myGrid.hasShip(row, col)) {
            myGrid.markHit(row, col);
            return true;
        } else {
            myGrid.markMiss(row, col);
            return false;
        }
    }

    // Record a guess on the opponent's grid
    public void recordMyGuess(int row, int col, boolean hit) {
        if (hit) {
            opponentGrid.markHit(row, col);
        } else {
            opponentGrid.markMiss(row, col);
        }
    }

    public void autoPlaceShips() {
        for (Ship ship : ships) {
            while (true) {
                int row = Randomizer.nextInt(0, Grid.NUM_ROWS - 1);
                int col = Randomizer.nextInt(0, Grid.NUM_COLS - 1);
                int direction = Randomizer.nextBoolean() ? 0 : 1;
                if (canPlaceShip(ship, row, col, direction)) {
                    chooseShipLocation(ship, row, col, direction);
                    break;
                }
            }
        }
    }

    private boolean canPlaceShip(Ship ship, int row, int col, int direction) {
        // Check if the ship can be placed at the specified location
        for (int i = 0; i < ship.getLength(); i++) {
            int r = direction == 1 ? row + i : row;
            int c = direction == 0 ? col + i : col;
            if (r >= Grid.NUM_ROWS || c >= Grid.NUM_COLS || myGrid.hasShip(r, c)) {
                return false;
            }
        }
        return true;
    }

    public boolean allShipsSunk() {
        for (Ship ship : ships) {
            for (int i = 0; i < ship.getLength(); i++) {
                int r = ship.getDirection() == 1 ? ship.getRow() + i : ship.getRow();
                int c = ship.getDirection() == 0 ? ship.getCol() + i : ship.getCol();
                if (!myGrid.get(r, c).checkHit()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isShipSunk(Ship ship) {
        for (int i = 0; i < ship.getLength(); i++) {
            int r = ship.getDirection() == 1 ? ship.getRow() + i : ship.getRow();
            int c = ship.getDirection() == 0 ? ship.getCol() + i : ship.getCol();
            if (!myGrid.get(r, c).checkHit()) {
                return false;
            }
        }
        return true;
    }

    public Ship[] getShips() {
        return ships;
    }

    public boolean isOccupied(int row, int col) {
        // Check if the specified cell is occupied by any ship
        for (Ship ship : getShips()) {
            if (ship.isAtLocation(row, col)) {
                return true;
            }
        }
        return false;
    }
}