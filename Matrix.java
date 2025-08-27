public class Matrix {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Our 3x3 Matrix...");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix){
        
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
