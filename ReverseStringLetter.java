public class ReverseStringLetter {
    public static void main(String[] args){
        String str = "Automation";
        String reversedStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }
        System.out.println("Input: "+str);
        System.out.println("Output: "+reversedStr);
    }
}
