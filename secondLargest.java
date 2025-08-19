public class secondLargest {
    public static void main(String[] args){
        int[] arr = {15, 24, 59, 32, 9, 19};
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int num : arr){
            if(num > largest){
                largest = num;
            }
        }

        for(int num : arr){
            if(num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
        System.out.println("Second Largest: "+secondLargest);
    }
}
