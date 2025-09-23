public class ReverseAnArray {
    public static int[] reversedArray(int[] arr){
        int[] reversed = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            reversed[i] = arr[arr.length - 1 - i];
        }
        
        return reversed;
    }

    public static void reverseInPlaceReversal(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr){
        System.out.print("{");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args){
        int[] original = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        printArray(original);

        int[] reversed = reversedArray(original);
        System.out.println("Reversed Array: ");
        printArray(reversed);

        int[] arrayToReverse = {1, 2, 3, 4, 5};
        System.out.println("Before in-place reversal: ");
        printArray(arrayToReverse);

        reverseInPlaceReversal(arrayToReverse);
        System.out.println("After in-place reversal: ");
        printArray(arrayToReverse);
    }
}
