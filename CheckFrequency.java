import java.util.*;

public class CheckFrequency{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",");
        checkFrequency(input);
        scan.close();
    }

    public static void checkFrequency(String[] arr){
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for(String element : arr){
            if(frequencyMap.containsKey(element)){
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else{
                frequencyMap.put(element, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}