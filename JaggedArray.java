import java.util.*;
public class JaggedArray {
    public static void main(String[] args){
        int n = 5;
        int[][] arr = new int[n][];

        for(int i = 0; i < n; i++){
            arr[i] = new int[i + 1];

            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("Jagged Array: "+Arrays.deepToString(arr));
    }
}
