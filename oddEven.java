public class oddEven {
    public static void main(String[] args){
        int[] arr = {2, 7, 4, 9, 6, 11};

        System.out.print("Even: ");
        for(int num : arr){
            if(num%2 == 0){
                System.out.print(num+" ");
            }
        }

        System.out.println();

        System.out.print("Odd: ");
        for(int num : arr){
            if(num%2 != 0){
                System.out.print(num+" ");
            }
        }
    }   
}
