import java.util.Arrays;

public class StringDuplicateRemove {
    public static void main(String[] args){
        String[] input = {"apple","banana","orange","apple","orange"};
        String[] result = removeDuplicates(input);

        System.out.println("Input: "+Arrays.toString(input));
        System.out.println("Output: "+Arrays.toString(result));
    }

    public static String[] removeDuplicates(String[] arr){
        return Arrays.stream(arr)
                     .distinct()
                     .toArray(String[] :: new);
    }
}
