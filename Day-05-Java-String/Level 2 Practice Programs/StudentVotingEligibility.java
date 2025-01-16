import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random ages for students and return a 1D array
    public static int[] generateAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = (int)(Math.random() * 81) + 10; // Random age between 10 and 90
        }
        return ages;
    }

    // Method to check if students can vote based on their age and return a 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]); // Age of the student
            
            // Check if age is valid and if student can vote
            if (ages[i] < 0) {
                eligibility[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][1] = "Cannot Vote";
            }
        }
        return eligibility;
    }

    // Method to display the 2D array in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        System.out.println("Age\t\tVoting Eligibility");
        System.out.println("------------------------------");
        for (String[] row : eligibility) {
            System.out.printf("%s\t\t%s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of students (fixed as 10)
        int numberOfStudents = 10;

        // Generate random ages for students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the result
        displayEligibility(eligibility);

        scanner.close();
    }
}
