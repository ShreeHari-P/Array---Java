import java.util.*;
public class stringMethod {
    public static void analyzeString(String str){
        
        int length = str.length();
        System.out.println("Length: "+length);

        char charAt4 = str.charAt(4);
        System.out.println("Char at 4: "+charAt4);

        String substring1 = str.substring(7);
        System.out.println("Substring: "+substring1);

        String substring2 = str.substring(3, 6);
        System.out.println("Substring 2: "+substring2);

        boolean endWithDot = str.endsWith(".");
        System.out.println("Ends with dot: "+endWithDot);

        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: "+uppercase);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        analyzeString(text);
        scan.close();
    }
}
