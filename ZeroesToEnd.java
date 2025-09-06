import java.util.*;
public class ZeroesToEnd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                          .mapToInt(Integer :: parseInt)
                          .toArray();
        moveZeroesToEnd(arr);
        System.out.println("Output: "+Arrays.toString(arr));
        scan.close();
    }

    public static void moveZeroesToEnd(int[] arr){
        int nonZeroIndex = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        while(nonZeroIndex < arr.length){
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
