import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(input);
        
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(result));
    }
    
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}

