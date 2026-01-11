public class SumOfColumn {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] colSum = new int[cols];

        for(int col = 0; col < cols; col++){
            int sum = 0;
            for(int row = 0; row < rows; row++){
                sum += matrix[row][col];
            }
            colSum[col] = sum;
        }

        System.out.println("Sum of Matrix Column: ");
        for(int col = 0; col < cols; col++){
            System.out.println("Col "+(col+1)+"-> "+colSum[col]);
        }
    }   
}
