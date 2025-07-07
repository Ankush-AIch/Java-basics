public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 8, 2},
            {4, 1, 7},
            {9, 6, 5}
        };

        int max = matrix[0][0]; // Start with the first element
        int maxRow = 0;
        int maxCol = 0;

        // Loop through the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Print the result
        System.out.println("Maximum element is: " + max);
        System.out.println("Located at: row " + maxRow + ", column " + maxCol);
    }
