import java.util.Scanner;

// Class to check if a number is an Armstrong number
class ArmstrongNumber {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = input.nextInt();
        
        // Variables to store the sum of cubes, original number, and digit calculation
        int sum = 0;
        int originalNumber = number;
        
        // Use a while loop to check each digit of the number
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;
            // Cube the digit and add it to sum
            sum += Math.pow(digit, 3);
            // Remove the last digit from the number
            number /= 10;
        }
        
        // Check if the sum of cubes equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        // Close the scanner object to prevent memory leakage
        input.close();
    }
}