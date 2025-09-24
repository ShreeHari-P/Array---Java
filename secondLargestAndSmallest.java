public class secondLargestAndSmallest {
    public static void main(String[] args){
        int[] arr = {7, 2, 9, 1, 5};

        if(arr.length < 2){
            System.out.println("Arrays should have at least 2 elements");
        }

        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : arr){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        for(int num : arr){
            if(num > secondLargest && num < max){
                secondLargest = num;
            }
            if(num < secondSmallest && num > min){
                secondSmallest = num;
            }
        }

        System.out.println("Second Largest: "+secondLargest);
        System.out.println("Second Smallest: "+secondSmallest);
    }
    
}