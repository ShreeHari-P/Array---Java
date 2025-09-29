public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5};
        int result = missingNumber(arr);

        System.out.println("The Missing Number is: "+result);
    }

    public static int missingNumber(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i + 1] - arr[i] > 1){
                return arr[i]+1;
            }
        }
        return -1;
    }
}
