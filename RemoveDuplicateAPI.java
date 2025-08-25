import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateAPI{
    public static void main(String[] args){
        int[] input = {1, 2, 2, 3, 4, 4, 5, 5};
        int[] result = removeDuplicates(input);

        System.out.println("Input: "+Arrays.toString(input));
        System.out.println("Output: "+Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr){
        return Arrays.stream(arr)
                     .distinct()
                     .toArray();
    }
}