public class largestInArray {
    public static void main(String[] args){
        int[][] matrix = {
            {41, 36, 8},{25, 68, 91}, {2,34, 11}
        };

        int largest = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest Element in the Array: " + largest);
    }
}
