public class ElementsInArray {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                count++;
            }
        }
        System.out.println("No.of Elements in the Array: " + count);
    }
}
