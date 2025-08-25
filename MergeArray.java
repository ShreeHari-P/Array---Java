import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args){
        int[] box1 = {1, 3, 5};
        int[] box2 = {2, 4, 6};
        int[] bigbox = mergeArrays(box1, box2);

        System.out.println("Box 1: "+Arrays.toString(box1));
        System.out.println("Box 2: "+Arrays.toString(box2));
        System.out.println("Big Box: "+Arrays.toString(bigbox));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        
        for(int toy : arr1){
            result[index++] = toy;
        }

        for(int toy : arr2){
            result[index++] = toy;
        }
        return result;
    }
}
