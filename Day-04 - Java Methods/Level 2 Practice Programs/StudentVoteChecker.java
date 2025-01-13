import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Student " + (i + 1) + " age: " + ages[i] + " - " +
                    (canStudentVote(ages[i]) ? "Can vote" : "Cannot vote"));
        }

        scanner.close();
    }
}
