import java.util.*;

public class DiagonalSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        int diagonalSum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            diagonalSum += matrix[i][i];
        }

        System.out.println("The diagonal sum of matrix is: "+diagonalSum);
        scan.close();
    }
}
