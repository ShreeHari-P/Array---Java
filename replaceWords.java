import java.util.*;
public class replaceWords {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equalsIgnoreCase("red")){
                arr[i] = "yellow";
            }
        }

        System.out.println("Replaced Arrays: "+String.join(",",arr));
        scan.close();
    }
}
