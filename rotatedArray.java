public class rotatedArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int rotate = 2;
        int n = arr.length;

        reverse(arr, 0, rotate - 1);

        reverse(arr, rotate, n - 1);

        reverse(arr, 0, n - 1);

        System.out.println("Rotated Array: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
