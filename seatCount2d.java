// Imagine a theater with booked seats (1 means booked, 0 means empty).
// Count how many empty seats are available.

import java.util.*;

public class seatCount2d {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int m = scan.nextInt(); int n = scan.nextInt();
        int[][] matrix = new int[m][n];
        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0)
                    count++;
            }
        }

        System.out.println("The Empty seats are: "+count);
    }    
}
