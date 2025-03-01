public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input) {
        myArray = input;
    }

    public boolean equals(Object[][] other) {
        // Check if dimensions are the same
        if (myArray.length != other.length) {
            return false;
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].length != other[i].length) {
                return false; // Check if inner array sizes match
            }

            for (int j = 0; j < myArray[i].length; j++) {
                if (!myArray[i][j].equals(other[i][j])) {
                    return false; // Use .equals() for element comparison
                }
            }
        }

        return true; // Arrays match in structure and content
    }
}