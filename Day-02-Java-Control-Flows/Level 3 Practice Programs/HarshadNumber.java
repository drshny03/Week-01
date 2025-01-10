import java.util.Scanner;

// Class to check if a number is a Harshad number
class HarshadNumber {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number to check if it is a Harshad number: ");
        int number = input.nextInt();
        
        // Variable to store the sum of digits
        int sum = 0;
        int originalNumber = number;
        
        // Use a while loop to calculate the sum of digits
        while (number != 0) {
            // Add the last digit of the number to sum
            sum += number % 10;
            // Remove the last digit from the number
            number /= 10;
        }
        
        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }
        
        // Close the scanner object to prevent memory leakage
        input.close();
    }
}