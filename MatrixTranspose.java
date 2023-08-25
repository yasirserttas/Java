public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("Orcinal Matrix:");
        printMatrix(matrix);
        
        System.out.println("\nTranspose Matrix:");
        printMatrix(transpose);
    }
    
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}