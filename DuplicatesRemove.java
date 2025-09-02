import java.util.*;

public class DuplicatesRemove{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",");
        int[] arr = new int[input.length];
        scan.close();

        for(int i = 0; i < input.length; i++){
            arr[i] = Integer.parseInt(input[i].trim());
        }

        int[] result = removeDuplicates(arr);
        System.out.println("Arrays: "+Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for(int num : set){
            result[i++] = num;
        }
        return result;
    }
}