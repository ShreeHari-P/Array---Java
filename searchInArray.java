public class searchInArray {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int target = 5;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                isFound = true;
            }
        }
        if(isFound){
            System.out.println("Found...");
        } else{
            System.out.println("Not Found...");
        }
        
    }
}
