public class copyArray {
    public static void main(String[] args){
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];

        for(int i = 0; i < sourceArray.length; i++){
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("Copied Array: ");
        for(int num : destinationArray){
            System.out.print(num+" ");
        }
    }
}
