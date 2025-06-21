package ex_06_Arrays;

public class MultiDimensional_Array {
    public static void main(String[] args) {
// Declares a 2D int array (matrix) named matrix with 3 rows and 3 columns.

        int matrix[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Accesses and prints the element at row 1, column 2 (remember 0-based indexing for both rows and columns).
        System.out.println(matrix[0][1]);

        // Uses nested for loops to iterate through the entire matrix and print each element,
        // row by row, similar to how a matrix is visually displayed. Make sure each row is on a new line.

        for(int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



    }
}
