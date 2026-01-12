import java.util.*;
public class SearchElement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of rows and cols: ");
        int m = scan.nextInt(); int n = scan.nextInt();
        int[][] matrix = new int[m][n];
        boolean found = false;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter element to be search: ");
        int target = scan.nextInt();
        int rowIndex = 0, colIndex = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == target){
                    found = true;
                    rowIndex = i;
                    colIndex = j;
                    break;
                }
            }
            if(found) break;
        }

        if(found)
        System.out.println("The Element "+target+" is found at Index: Row -> "+(rowIndex+1)+", Col -> "+(colIndex+1));
        else
            System.out.println("The Element "+target+" is not found");
        scan.close();
    }
}
