import java.util.*;

public class ArrayPattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of Square Matrix: ");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
        matrix[i][j] = scan.nextInt();

        System.out.print("Main Diagonal: ");
        for(int i = 0; i < n; i++)
            System.out.print(matrix[i][i]+" ");
        System.out.println();

        System.out.print("Anti-Diagonal: ");
        for(int i = 0; i < n; i++)
            System.out.print(matrix[i][n-1-i]+" ");
        System.out.println();

        System.out.print("Top Border: ");
        for(int i = 0; i < n; i++)
            System.out.print(matrix[0][i]+" ");
        System.out.println();

        System.out.print("Bottom Border: ");
        for(int i = 0; i < n; i++)
            System.out.print(matrix[n - 1][i]+" ");
        System.out.println();

        System.out.print("Left Border: ");
        for(int i = 0; i < n; i++)
            System.out.print(matrix[i][0]+" ");
        System.out.println();

        System.out.print("Right Border: ");
        for(int i = 0; i < n; i++)
            System.out.print(matrix[i][n - 1]+" ");
        System.out.println();

        scan.close();
    }    
}
