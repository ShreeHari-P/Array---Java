import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeated {
    public static void main(String[] args){
        String input = "swiss";
        char result = findFirstNonRepeated(input);
        System.out.println("First Non Repeated character: "+result);
    } 

    public static char findFirstNonRepeated(String str){
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '\0';

    }
}
