public class largestSmallest {
    public static void main(String[] args){
        int[] num = {8, 3, 15, 7, 9};

        int max = num[0];
        int min = num[0];

        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
        }

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
