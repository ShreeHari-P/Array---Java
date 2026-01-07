public class RainfallTracker {
    public static void main(String[] args){
        int[][] rainFall = {
            {10,20,30},
            {40,10,5},
            {25, 25, 25}
        };

        int maxRainfall = Integer.MIN_VALUE;
        int cityIndex = -1;

        for(int i = 0; i < rainFall.length; i++){
            int sum = 0;

            for(int j = 0; j < rainFall[i].length; j++){
                sum += rainFall[i][j];
            }

            if(sum > maxRainfall){
                maxRainfall = sum;
                cityIndex = i;
            }
        }

        System.out.println("City with maximum rainfall: City "+(cityIndex+1));
        System.out.println("Total rainfall: "+ maxRainfall);
    }
}
