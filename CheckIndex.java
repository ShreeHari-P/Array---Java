import java.util.*;

public class CheckIndex {
    public static int checkIndex(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = {2, 4, 5, 7, 1, 3, 6, 9, 8};

        System.out.println("Enter Target Value: ");
        int target = scan.nextInt();

        int result = checkIndex(arr, target);
        
        if(result != -1){
            System.out.println("The Targeted Value "+target+" is found at Index "+result);
        } else{
            System.out.println("The Targeted Value "+target+" is not found in the Array");
        }
        scan.close();
    }
}
