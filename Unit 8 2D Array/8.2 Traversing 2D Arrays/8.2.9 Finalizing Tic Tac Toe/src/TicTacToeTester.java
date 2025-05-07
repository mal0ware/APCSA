import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        boolean gameWon = false;
        boolean isTie = false;

        System.out.println("Welcome to Tic Tac Toe!");
        game.printBoard();

        // Game loop
        while (!gameWon && !isTie)
        {
            System.out.println("\nTurn " + (game.getTurn() % 2 == 0 ? "X" : "O"));
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();

            // Validate the chosen location
            if (game.pickLocation(row, col))
            {
                game.takeTurn(row, col); // Take the turn
                game.printBoard(); // Print the board

                // Check for a winner
                gameWon = game.checkWin();
                if (gameWon)
                {
                    System.out.println("\nPlayer " + (game.getTurn() % 2 == 0 ? "O" : "X") + " wins!");
                }

                // Check for a tie (if the board is full and no one has won)
                isTie = game.getTurn() == 9 && !gameWon;
                if (isTie)
                {
                    System.out.println("\nIt's a tie!");
                }
            }
            else
            {
                System.out.println("\nInvalid move! The spot is either occupied or out of bounds. Try again.");
            }
        }

        scanner.close();
    }
}