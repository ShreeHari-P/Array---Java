import java.util.*;
public class CheckSortedArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",");
        int[] arr = new int[input.length];
       
        for(int i = 0; i < input.length; i++){
            arr[i] = Integer.parseInt(input[i].trim());
        }

        scan.close();
        boolean isSortedAscending = checkAscending(arr);
        boolean isSortedDescending = checkDescending(arr);

        if(isSortedAscending || isSortedDescending){
            System.out.println("Sorted");
        } else{
            System.out.println("Not Sorted");   
        }
        
    }

    public static boolean checkAscending(int[] arr){
        if(arr.length <= 1){
            return true;
        } else{
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i + 1]){
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean checkDescending(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}
