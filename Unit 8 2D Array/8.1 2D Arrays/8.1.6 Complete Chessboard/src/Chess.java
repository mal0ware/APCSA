public class Chess {
    public static void main(String[] args) 
    {
        // Create an 8x8 2D String array called chess
        String[][] chess = new String[8][8];
        
        // Fill the chess board with the correct pieces
        initializeRow(chess, 0, "Castle", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Castle");
        initializeRow(chess, 7, "Castle", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Castle");
        
        // Fill the second and seventh rows (with pawns)
        for (int i = 0; i < 8; i++) 
        {
            chess[1][i] = "Pawn";
            chess[6][i] = "Pawn";
        }

        // Fill the middle rows (with empty spaces)
        for (int i = 2; i < 6; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                chess[i][j] = "-";
            }
        }

        // Use this method to print the chess board onto the console
        printBoard(chess);
    }

    // Helper method to initialize the first and last rows
    public static void initializeRow(String[][] chess, int row, String... pieces) {
        for (int i = 0; i < pieces.length; i++) 
        {
            chess[row][i] = pieces[i];
        }
    }

    // Do not make alterations to this method!
    public static void printBoard(String[][] array) 
    {
        for (String[] row : array) 
        {
            for (String thing : row) 
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}