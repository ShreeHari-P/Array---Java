import java.util.*;

public class SymmetricMatrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        boolean isSymmetric = true;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] != matrix[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
            if(!isSymmetric) break;
        }

        if(isSymmetric) System.out.println("The Matrix is Symmetric");
        else System.out.println("The Matrix is Not Symmetric");
        scan.close();
    }
}
