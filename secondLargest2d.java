import java.util.*;

public class secondLargest2d {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of rows & column: ");
        int m = scan.nextInt(); int n = scan.nextInt();
        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
        matrix[i][j] = scan.nextInt();
    
        for(int i = 0; i < m; i++){
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for(int j = 0; j < n; j++){
                int value = matrix[i][j];

                if(value > largest){
                    secondLargest = largest;
                    largest = value;
                } else if(value > secondLargest && value < largest){
                    secondLargest = value;
                }
            }
            System.out.println("Second largest in row ["+(i+1)+"]: "+secondLargest);
        }
        scan.close();
    }    
}
