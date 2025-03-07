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
            //System.out.print("Enter row (A-J) for ship of length " + ship.getLength() + ": ");
            int row = (int)readLine("Enter row (A-J) for ship of length " + ship.getLength() + ": ").toUpperCase().charAt(0)-65;
            int col = readInt("Enter column (1-10) for ship of length " + ship.getLength() + ": ") - 1;
            int direction = readInt("Enter direction (0 for horizontal, 1 for vertical): ");
            player.chooseShipLocation(ship, row, col, direction);
        }
    }

    private boolean takeTurn(Player currentPlayer, Player opponent) {
        askForGuess(currentPlayer, opponent);
        return opponent.allShipsSunk();
    }

    private void askForGuess(Player currentPlayer, Player opponent) {
        System.out.print("Enter row (A-J): ");
        int row = (int)input.nextLine().toUpperCase().charAt(0)-65;
        int col = readInt("Enter column (1-10): ") - 1;

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