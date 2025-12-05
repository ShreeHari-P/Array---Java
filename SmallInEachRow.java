import java.util.Arrays;
public class SmallInEachRow {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] smallestInEachRow = new int[rows];
        
        for(int i = 0; i < rows; i++){
            int minInRow = Integer.MAX_VALUE;
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] < minInRow){
                    minInRow = matrix[i][j];
                }
            }
            smallestInEachRow[i] = minInRow;
        }
         System.out.println("Small In Rows ->" + Arrays.toString(smallestInEachRow));
    }
}
