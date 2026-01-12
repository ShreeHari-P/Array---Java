public class Transpose {
    public static void main(String[] args){
        int[][] arrA= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arrA.length;
        int[][] arrB = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arrB[i][j] = arrA[j][i];
            }
        }

        System.out.println("Transpose of a square Matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arrB[i][j]+" ");
            }
            System.out.println();
        }
    }
}
