import java.util.*;

public class deleteArray{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int index = scan.nextInt();
        String[] arr = input.split(",");
        String[] modifiedArr = deleteElement(arr, index);
        System.out.println(String.join(" ", modifiedArr));
        scan.close();
    }

    public static String[] deleteElement(String[] arr, int index){

        if(index < 0 || index >= arr.length){
            System.out.println("Invalid Index...");
            return arr;
        }

        String[] newArr = new String[arr.length - 1];

        for(int i = 0; i < index; i++){
            newArr[i] = arr[i].trim();
        }

        for(int i = index; i < newArr.length; i++){
            newArr[i] = arr[i + 1].trim();
        }

        return newArr;
    }
}