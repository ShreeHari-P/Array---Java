public class countFrequency {
    public static void main(String[] args){
        int[] numbers = {1, 2, 2, 3, 4, 2, 5};
        int target = 2;
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                count++;
            }
        }
        System.out.println(target+" Count is: "+count);
    }
}
