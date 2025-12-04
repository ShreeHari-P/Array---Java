public class SumOfArray {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6}
        };

        int sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of the matrix: " + sum);
    }
}
