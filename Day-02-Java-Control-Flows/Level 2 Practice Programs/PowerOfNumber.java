import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the base number and power input
        System.out.println("Enter the base number:");
        int number = input.nextInt();
        System.out.println("Enter the power:");
        int power = input.nextInt();

        // Initialize the result variable
        int result = 1;

        // Loop through from 1 to power to calculate the result
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the base number
        }

        // Output the result
        System.out.println("The result of " + number + " raised to the power " + power + " is: " + result);

        // Close the scanner stream
        input.close();
    }
}