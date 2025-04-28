public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {
            {32, 4, 14, 65, 23, 6},
            {4, 2, 53, 31, 765, 34},
            {64235, 23, 522, 124, 42, 64}
        };

        // Traverse each row and print its sum
        for (int i = 0; i < array.length; i++) {
            System.out.println(sumRow(array, i));
        }
    }

    // Method to sum the elements of a specific row in a 2D array
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;
        // Traverse the specified row
        for (int col = 0; col < array[row].length; col++) {
            sum += array[row][col];
        }
        return sum;
    }
}