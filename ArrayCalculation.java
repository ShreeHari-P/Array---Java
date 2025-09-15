public class ArrayCalculation {
    // Write your methods here

    public static String getClassStats(int[] grades){
        double sum = 0;
        for(int num : grades){
            sum += num;
        }
        double avg = sum / grades.length;

        int max = grades[0], min = grades[0];
        for(int num : grades){
            if(num > max) max = num;
            if(num < min) min = num;
    }

        int passingCount = 0;
        for(int num : grades){
            if(num >= 60) passingCount++;
        }

        return String.format("Class Statistics:\nClass Average: %.1f\nHighest Grades: %d\nLowest Grade: %d\nPassing Grades: %d/%d",
         avg, max, min, passingCount, grades.length);
}

    public static String getLetterGrades(int[] grades){
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0; 
        for(int num : grades){
            if(num >= 90) countA++;
            else if(num >= 80) countB++;
            else if(num >= 70) countC++;
            else if(num >= 60) countD++;
            else countF++;
        }

        return String.format("Grade Distribution:\nA (90-100): %d\nB (89-89): %d\nC (70-79): %d\nD (60-69): %d\nF (0-59): %d",
         countA, countB, countC, countD, countF);
    }

    public static String getImprovement(int[] startGrades, int[] endGrades){
        if(startGrades.length != endGrades.length) return "Error, Arrays must be the same length";

        double totalImprovement = 0;
        for(int i = 0; i < startGrades.length; i++){
            totalImprovement += (endGrades[i] - startGrades[i]);
        }
        double avgImprovement = totalImprovement / startGrades.length;

        int mostImproved = 0;
        for(int i = 0; i < startGrades.length; i++){
            int improved = (endGrades[i] - startGrades[i]);
            if(improved > mostImproved){
                mostImproved = improved;
            }
        }

        int improvedCount = 0;
        for(int i = 0; i < startGrades.length; i++){
            if(endGrades[i] > startGrades[i]){
                improvedCount++;
            }
        }

        return String.format("Improved Analysis:\nAverage Improved: %.1f points\nMost Improved: %d points\nStudents Improved: %d/%d", 
        avgImprovement, mostImproved, improvedCount, endGrades.length);
    }
    public static void main(String[] args) {
        // Test data
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};
        
        // Test getClassStats
        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));
        
        // Test getLetterGrades
        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));
        
        // Test getImprovement
        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }
}