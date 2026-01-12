public class DiagonalSums {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 4},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;
        int primaryDiagonal = 0, secondaryDiagonal = 0;

        for(int i = 0; i < n; i++){
            primaryDiagonal += matrix[i][i];
        }
        for(int i = 0; i < n; i++){
            int j = n - 1 - i;
            secondaryDiagonal += matrix[i][j];
        }

        System.out.println("Primary Diagonal Sum: "+primaryDiagonal);
        System.out.println("Secondary Diagonal Sum: "+secondaryDiagonal);
    }
}
