import java.util.*;
public class StudentAverage {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of rows and cols: ");
        int m = scan.nextInt(); int n = scan.nextInt();
        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
        matrix[i][j] = scan.nextInt();

        printAverage(matrix);
        scan.close();
    }

    public static void printAverage(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            int sum = 0;

            for(int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }

            double avg = (double) sum / matrix[i].length;

            System.out.println("Student "+(i+1)+" Average: "+avg);
        }

    }
}
