public class TicTacToe 
{
   private String[][] board; // 2D array representing the game board
   private int turn; // Tracks the turn count

   // Constructor to initialize the board and turn
   public TicTacToe() 
   {
      board = new String[3][3];
      for (int i = 0; i < 3; i++) 
      {
         for (int j = 0; j < 3; j++) 
         {
               board[i][j] = "-";
         }
      }
      turn = 0;
   }

   // This method returns the current turn
   public int getTurn() 
   {
      return turn;
   }

   // This method prints out the board array on to the console
   public void printBoard() 
   {
   System.out.print(" ");
   for (int col = 0; col < 3; col++) 
   {
      System.out.print(" " + col);
   }
   System.out.println();
   for (int row = 0; row < 3; row++) 
   {
      System.out.print(row + " ");
      for (int col = 0; col < 3; col++) 
      {
            System.out.print(board[row][col] + " ");
      }
      System.out.println();
   }
   }

   // This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col) 
   {
      return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col].equals("-");
   }

   // This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col) 
   {
      if (turn % 2 == 0) 
      {
         board[row][col] = "X";
      } 
      else 
      {
         board[row][col] = "O";
      }
      turn++;
   }

   // This method returns true if a row has three X or O's in a row
   public boolean checkRow() {
      for (int row = 0; row < 3; row++) 
      {
         if (!board[row][0].equals("-") && board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2])) 
         {
            return true;
         }
      }
      return false;
   }

   // This method returns true if a column has three X or O's
   public boolean checkColumn() 
   {
      for (int col = 0; col < 3; col++) 
      {
         if (!board[0][col].equals("-") && board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col])) 
         {
            return true;
         }
      }
      return false;
   }

   // This method returns true if either diagonal has three X or O's
   public boolean checkDiagonal() 
   {
      return (!board[0][0].equals("-") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
         || (!board[0][2].equals("-") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]));
   }

   // This method returns true if someone has won the game
   public boolean checkWin() 
   {
      return checkRow() || checkColumn() || checkDiagonal();
   }
}