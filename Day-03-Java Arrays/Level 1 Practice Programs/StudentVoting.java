import java.util.Scanner;

// Program to check if students are eligible to vote based on their age.
class StudentVoting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Input student ages
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }

        // Check voting eligibility
        for (int age : studentAges) {
            if (age < 0) {
                System.out.println("Invalid age: " + age); // Handle invalid input
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote."); // Voting eligible
            } else {
                System.out.println("The student with age " + age + " cannot vote."); // Not eligible
            }
        }

        input.close(); // Close Scanner object
    }
}
