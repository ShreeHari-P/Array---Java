public class MultiplicationOfMatrix {
    public static void main(String[] args){
        int[][] matrix1= {
            {1, 2, 3},{4, 5, 6},{7, 8, 9}
        };

        int[][] matrix2 ={
            {1, 2, 3},{1, 2, 3},{1, 2, 3}
        };

        int row1 = matrix1.length, col1 = matrix1[0].length;
        int row2 = matrix2.length, col2 = matrix2[0].length;
        int[][] result = new int[col1][row2];

        for(int i = 0; i < col1; i++){
            for(int j = 0; j < row2; j++){
                result[i][j] = 0;
                for(int k = 0; k < col2; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Multiplication of Matrices: ");
        for(int i = 0; i < col1; i++){
            for(int j = 0; j < row2; j++){
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
        
    }
}
