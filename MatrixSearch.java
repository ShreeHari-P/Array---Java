public class MatrixSearch {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30},
            {15, 25, 35},
            {27, 29, 37}
        };

        int target = 25;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == target) {
                    System.out.println("Number found");
                    System.out.println("Row: " + (i + 1) + ", Column: " + (j + 1));
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found");
        }
    }
}

}
