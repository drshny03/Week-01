
import java.util.Scanner;

// Class to count the number of digits in an integer
class CountDigits {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number to count its digits: ");
        int number = input.nextInt();
        
        // Variable to store the count of digits
        int count = 0;
        
        // Use a while loop to count the digits
        while (number != 0) {
            // Remove the last digit from the number
            number /= 10;
            // Increment the count for each digit
            count++;
        }
        
        // Output the count of digits
        System.out.println("The number has " + count + " digits.");
        
        // Close the scanner object to prevent memory leakage
        input.close();
    }
}

