import java.util.*;
public class modifyArrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String textArr = scan.nextLine();
        int index = scan.nextInt();
        scan.nextLine();
        String newElement = scan.nextLine();
        String[] arr = textArr.split(",");
        String[] modifiedArr = changeElement(arr, index, newElement);
        System.out.println("Modified Arrays: "+Arrays.toString(modifiedArr));
    }

    public static String[] changeElement(String[] arr, int index, String newElement){
        
        if(index >= 0 && index < arr.length){
            arr[index] = newElement;
        } else{
            System.out.println("Invalid Input...");
        }
        return arr;
    }
}
