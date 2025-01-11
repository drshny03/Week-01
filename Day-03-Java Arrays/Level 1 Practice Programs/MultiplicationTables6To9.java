import java.util.Scanner;

// Program to find the multiplication table of a number from 6 to 9
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number for which the multiplication table is needed
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store multiplication results
        int[] multiplicationResult = new int[4];

        // Calculate the multiplication table for numbers from 6 to 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (6 + i);
        }

        // Display the results in the required format
        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }

        input.close(); // Close Scanner object
    }
}
