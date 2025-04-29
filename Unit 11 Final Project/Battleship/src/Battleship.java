import java.util.Scanner;
public class Battleship extends ConsoleProgram
{
    Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public void run()
    {
        player1 = new Player();
        player2 = new Player();

        // Place ships for player 1
        placeShips(player1);

        // Automatically place ships for player 2
        player2.autoPlaceShips();

        // Start the game loop
        while (true) {
            if (takeTurn(player1, player2)) {
                System.out.println("Player 1 wins!");
                break;
            }
            if (takeTurn(player2, player1)) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }

    private void placeShips(Player player) {
        for (Ship ship : player.getShips()) {
            boolean validPlacement = false;
            while (!validPlacement) {
                int row = -1, col = -1, direction = -1;
                while (row < 0 || row > 9) {
                    System.out.print("Enter row (A-J) for ship of length " + ship.getLength() + ": ");
                    row = (int)input.nextLine().toUpperCase().charAt(0) - 65;
                    if (row < 0 || row > 9) {
                        System.out.println("Invalid row. Please enter a letter between A and J.");
                    }
                }
                while (col < 0 || col > 9) {
                    col = readInt("Enter column (1-10) for ship of length " + ship.getLength() + ": ") - 1;
                    if (col < 0 || col > 9) {
                        System.out.println("Invalid column. Please enter a number between 1 and 10.");
                    }
                }
                while (direction != 0 && direction != 1) {
                    direction = readInt("Enter direction (0 for horizontal, 1 for vertical): ");
                    if (direction != 0 && direction != 1) {
                        System.out.println("Invalid direction. Please enter 0 for horizontal or 1 for vertical.");
                    }
                }
                
                if (isValidPlacement(player, ship, row, col, direction)) {
                    player.chooseShipLocation(ship, row, col, direction);
                    validPlacement = true;
                    player.printMyShips(); // Print the grid after successfully placing a ship
                } else {
                    System.out.println("Invalid placement. Please try again.");
                }
            }
        }
    }

    private boolean isValidPlacement(Player player, Ship ship, int row, int col, int direction) {
        // Check if the ship is within bounds
        if (direction == 0) { // horizontal
            if (col + ship.getLength() > 10) return false;
        } else { // vertical
            if (row + ship.getLength() > 10) return false;
        }

        // Check if the ship overlaps with any existing ships
        for (int i = 0; i < ship.getLength(); i++) {
            int checkRow = direction == 0 ? row : row + i;
            int checkCol = direction == 0 ? col + i : col;
            if (player.isOccupied(checkRow, checkCol)) return false;
        }

        return true;
    }

    private boolean takeTurn(Player currentPlayer, Player opponent) {
        askForGuess(currentPlayer, opponent);
        return opponent.allShipsSunk();
    }

    private void askForGuess(Player currentPlayer, Player opponent) {
        int row = -1, col = -1;
        while (row < 0 || row > 9) {
            System.out.print("Take a shot! Enter row (A-J): ");
            row = (int)input.nextLine().toUpperCase().charAt(0) - 65;
            if (row < 0 || row > 9) {
                System.out.println("Invalid row. Please enter a letter between A and J.");
            }
        }
        while (col < 0 || col > 9) {
            col = readInt("Enter column (1-10): ") - 1;
            if (col < 0 || col > 9) {
                System.out.println("Invalid column. Please enter a number between 1 and 10.");
            }
        }

        boolean hit = opponent.recordOpponentGuess(row, col);
        currentPlayer.recordMyGuess(row, col, hit);

        if (hit) {
            System.out.println("Hit!");
            // Check if any ship has been sunk
            for (Ship ship : opponent.getShips()) {
                if (opponent.isShipSunk(ship)) {
                    System.out.println("You sunk a " + ship.getLength() + "-length ship!");
                }
            }
        } else {
            System.out.println("Miss!");
        }

        // Print updated board status
        System.out.println("Current Player's Guesses:");
        currentPlayer.printMyGuesses();
        System.out.println("Current Player's Ships:");
        currentPlayer.printMyShips();
    }
}