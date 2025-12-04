public class EvenElementsInArray {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 3, 6},
            {56, 89, 23},
            {32, 66, 8}
        };

        int evenCount = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j]%2 == 0){
                    evenCount++;
                }
            }
        }
        System.out.println("No.of Even Elements: " + evenCount);
    }
}
