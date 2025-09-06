import java.util.*;
public class FindPair {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter An Array: ");
        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                        .mapToInt(Integer :: parseInt)
                        .toArray();
        System.out.print("Enter Target Sum: ");
        int targetSum = scan.nextInt();
        findPairs(arr, targetSum);
        scan.close();
    }

    public static void findPairs(int[] arr, int targetSum){
        Set<Integer> seen = new HashSet<>();
        List<String> pairs = new ArrayList<>();

        for(int num : arr){
            int complement = targetSum - num;

            if(seen.contains(complement)){
                pairs.add("(" + Math.min(num, complement) + "," + Math.max(num, complement) + ")");
            }
            seen.add(num);
        }

        if(pairs.isEmpty()){
            System.out.println("No Pairs Found");
        } else{
            System.out.println("Output: "+String.join(",",pairs));
        }
    }
}
