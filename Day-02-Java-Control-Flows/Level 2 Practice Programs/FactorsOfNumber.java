import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number input
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Loop through from 1 to number-1 to find factors
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }

        // Close the scanner stream
        input.close();
    }
}
