import java.util.*;
public class LotteryNumberCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] input = Arrays.stream(scan.nextLine().split(" "))
                            .mapToInt(Integer :: parseInt)
                            .toArray();
        int[] result = removeDuplicates(input);
        System.out.println(Arrays.toString(result));
    }    

    public static int[] removeDuplicates(int[] arr){
        Set<Integer> pages = new LinkedHashSet<>();
        for(int num : arr){
            pages.add(num);
        }

        int[] result = new int[pages.size()];
        int i = 0;
        for(int num : pages){
            result[i++] = num;
        }

        return result;
    }
}
