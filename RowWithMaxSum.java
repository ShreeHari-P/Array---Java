import java.util.*;
public class RowWithMaxSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of rows and cols: ");
        int m = scan.nextInt(); int n = scan.nextInt();
        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
        matrix[i][j] = scan.nextInt();
        
        highestSum(matrix);
        scan.close();
    }

    public static void highestSum(int[][] matrix){
        int maxSum = 0;
        int index = -1;

        for(int i = 0; i < matrix.length; i++){
            int rowSum = 0;

            for(int j = 0; j < matrix[i].length; j++){
                rowSum += matrix[i][j];
            }

            if(rowSum > maxSum){
                maxSum = rowSum;
                index = i;
            }
        }

        System.out.println("Row With Maximum Sale: "+(index+1));
        System.out.println("Maximum Sum: "+maxSum);
    }
}
