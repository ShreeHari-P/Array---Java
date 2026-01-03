// Find the sum of all border elements in a 2D array.

import java.util.*;
public class SumOfMatrixBorder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int m = scan.nextInt(); int n = scan.nextInt();
        int[][] matrix = new int[m][n];
        int sum = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == m - 1 || j == 0 || j == n - 1){
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of Matrix Border: " + sum);
        scan.close();
    }    
}
