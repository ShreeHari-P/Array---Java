import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
        int[] input = {5, 1, 8, 10, 1, 3};

        System.out.println("Before Sort: "+Arrays.toString(input));
        bubbleSort(input);
        System.out.println("After Sort: "+Arrays.toString(input));
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}