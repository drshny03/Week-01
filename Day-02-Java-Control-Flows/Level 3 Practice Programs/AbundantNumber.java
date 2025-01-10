import java.util.Scanner;

// Class to check if a number is an Abundant number
class AbundantNumber {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number to check if it is an Abundant number: ");
        int number = input.nextInt();
        
        // Variable to store the sum of divisors
        int sum = 0;
        
        // Run a loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of the number
            if (number % i == 0) {
                // Add the divisor to sum
                sum += i;
            }
        }
        
        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
        
        // Close the scanner object to prevent memory leakage
        input.close();
    }
}