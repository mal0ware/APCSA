public class Battleship extends ConsoleProgram
{
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
            int row = readInt("Enter row (0-9) for ship of length " + ship.getLength() + ": ");
            int col = readInt("Enter column (0-9) for ship of length " + ship.getLength() + ": ");
            int direction = readInt("Enter direction (0 for horizontal, 1 for vertical): ");
            player.chooseShipLocation(ship, row, col, direction);
        }
    }

    private boolean takeTurn(Player currentPlayer, Player opponent) {
        askForGuess(currentPlayer, opponent);
        return opponent.allShipsSunk();
    }

    private void askForGuess(Player currentPlayer, Player opponent) {
        int row = readInt("Enter row (0-9): ");
        int col = readInt("Enter column (0-9): ");

        boolean hit = opponent.recordOpponentGuess(row, col);
        if (hit) {
            System.out.println("Hit!");
        } else {
            System.out.println("Miss!");
        }

        // Print updated board status
        System.out.println("Current Player's Guesses:");
        currentPlayer.printMyGuesses();
        System.out.println("Opponent's Ships:");
        opponent.printMyShips();
    }
}
