import java.util.Random;

public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths for students
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // 3 columns: PCM scores
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(101); // Physics score
            scores[i][1] = random.nextInt(101); // Chemistry score
            scores[i][2] = random.nextInt(101); // Maths score
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateScores(int[][] scores, int numberOfStudents) {
        double[][] result = new double[numberOfStudents][3]; // 3 columns: Total, Average, Percentage

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to calculate the grade based on the percentage
    public static String[] calculateGrades(double[][] result, int numberOfStudents) {
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = result[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] result, String[] grades, int numberOfStudents) {
        System.out.println("Student | Physics | Chemistry | Maths | Total | Average | Percentage | Grade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + "        | " 
                               + scores[i][0] + "       | " 
                               + scores[i][1] + "        | " 
                               + scores[i][2] + "     | " 
                               + result[i][0] + "     | " 
                               + result[i][1] + "      | " 
                               + result[i][2] + "        | " 
                               + grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;

        // Generate random scores
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] result = calculateScores(scores, numberOfStudents);

        // Calculate grades based on percentage
        String[] grades = calculateGrades(result, numberOfStudents);

        // Display the scorecard
        displayScorecard(scores, result, grades, numberOfStudents);
    }
}
