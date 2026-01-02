// 10. Heat Map Normalization (Real-world) 
// You are given a 2D heat map of temperatures. 
// Find: 
// Highest temperature 
// Lowest temperature 
// Difference (range) 
// 32 40 50 60 55 45

import java.util.*;
public class HeatMap {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no.of rows and cols: ");
        int m = scan.nextInt(); int n = scan.nextInt();
        int[][] heatMap = new int[m][n]; 

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                heatMap[i][j] = scan.nextInt();
            }
        }

        int minHeat = Integer.MAX_VALUE;
        int maxHeat = Integer.MIN_VALUE;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int value = heatMap[i][j];

                if(value > maxHeat) maxHeat = value;
                if(value < minHeat) minHeat = value; 
            }
        }
        int range = maxHeat - minHeat;
        System.out.println("Highest temperature: "+maxHeat);
        System.out.println("Lowest temperature: "+minHeat);
        System.out.println("Temperature range: "+range);
        scan.close();
    }
}
