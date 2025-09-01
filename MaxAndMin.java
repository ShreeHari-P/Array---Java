import java.util.*;
public class MaxAndMin {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

    String[] stringArr = input.split(",");
    int[] arr = new int[stringArr.length];
    scan.close();

    for(int i = 0; i < stringArr.length; i++){
        arr[i] = Integer.parseInt(stringArr[i].trim());
    }
    findMaxAndMin(arr);
    }

    public static void findMaxAndMin(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int num : arr){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
