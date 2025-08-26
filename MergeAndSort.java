import java.util.Arrays;

public class MergeAndSort {
    public static void main(String[] args){
        int[] box1 = {1, 3, 5};
        int[] box2 = {2, 4, 6};
        int[] bigbox = mergeAndSort(box1, box2);

        System.out.println("Box 1: "+Arrays.toString(box1));
        System.out.println("Box 2: "+Arrays.toString(box2));
        System.out.println("Big Box: "+Arrays.toString(bigbox));
    }

    public static int[] mergeAndSort(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        for(int num : arr1){
            result[index++] = num;
        }

        for(int num : arr2){
            result[index++] = num;
        }
        Arrays.sort(result);
        return result;
    }
}