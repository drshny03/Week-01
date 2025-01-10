// Creating a class to find the quotient and remainder of two numbers
import java.util.Scanner;

class QuotientReminder {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        
        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        // Display the result
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}
