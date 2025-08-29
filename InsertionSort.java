import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] input = {23, 1, 10, 5, 2};

        System.out.println("Before Sort: "+Arrays.toString(input));
        insertionSort(input);
        System.out.println("After Sort: "+Arrays.toString(input));
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;   
            }
            arr[j + 1] = key;
        } 
    }
}
