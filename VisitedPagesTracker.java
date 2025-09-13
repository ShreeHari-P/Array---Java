import java.util.*;
public class VisitedPagesTracker {
    public static void main(String[] args){
        String[] input = {"Home","Products","Cart","Products","Checkout"};
        String[] result = removeDuplicates(input);
        System.out.println(Arrays.toString(result));
    }

    public static String[] removeDuplicates(String[] arr){
        Set<String> set = new LinkedHashSet<>();
        for(String element : arr){
            set.add(element);
        }

        String[] result = new String[set.size()];
        int i = 0;
        for(String element : set){
            result[i++] = element;
        }
        return result;
    }
}
