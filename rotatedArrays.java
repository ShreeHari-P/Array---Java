import java.util.*;
public class rotatedArrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",");
        int rotate = scan.nextInt();
        int n = input.length;
        int[] arr = new int[input.length];
        for(int i = 0; i < input.length; i++){
            arr[i] = Integer.parseInt(input[i].trim());
        }
        System.out.println("Input Arrays: "+Arrays.toString(arr));
        rotatedArray(arr, 0, rotate - 1);
        rotatedArray(arr, rotate, n - 1);
        rotatedArray(arr, 0, n - 1);
        System.out.println("Rotated Arrays: "+Arrays.toString(arr));
    }

    public static int[] rotatedArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
