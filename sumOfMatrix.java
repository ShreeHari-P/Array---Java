import java.util.Arrays;
public class sumOfMatrix {
    public static void main(String[] args){
        int[][] matrix1 = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        int row = matrix1.length, col = matrix1[0].length;
        int[][] result = new int[row][col];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of Two Matrices: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("%3d",result[i][j]);
            }
            System.out.println();
        }
    }
}
