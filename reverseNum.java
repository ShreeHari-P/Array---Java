public class reverseNum {
    public static void array(int[] arr){
        System.out.println("Array in Reverse Order...");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40, 50};
        array(list);
    }
}
