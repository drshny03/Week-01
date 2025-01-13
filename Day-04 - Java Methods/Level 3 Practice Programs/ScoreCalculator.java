//import scanner class
import java.util.Scanner;

class ScoreCalculator {

    //method to generate random scores
    public static int[][] generateScores(int numStudents) {

        //2D array to store score
        int[][] scores = new int[numStudents][3];
        for(int i = 0; i < numStudents; i++){

            //generate randome score
            scores[i][0] = (int) (Math.random() * 90 + 10); 
            scores[i][1] = (int) (Math.random() * 90 + 10); 
            scores[i][2] = (int) (Math.random() * 90 + 10);
        }

        //return score
        return scores;
    }

    //Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores){
        int numberOfStudents = scores.length;
        //2D array to store result

        double[][] results = new double[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;
            results[i][0] = total;
            // Rounded to 2 decimal places
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        //return result
        return results;
    }

    //method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results){

        //display results
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        // Rows for each student
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
    }

    // Main method
    public static void main(String[] args){

        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //input number of student
        System.out.print("Enter the number of students- ");
        int numberOfStudents = input.nextInt();

        //Generate random scores
        int[][] scores = generateScores(numberOfStudents);
        //Calculate result
        double[][] results = calculateResults(scores);

        //display the result and score
        displayScorecard(scores, results);

        //close scanner object
        input.close();
    }
}
