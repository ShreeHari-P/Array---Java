public class sumOfArray {
    public static void sum(int[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of Array is: "+sum);
    }

    public static void main(String[] args){
        int[] list = {5, 10, 15, 20};
        sum(list);
    }
}
