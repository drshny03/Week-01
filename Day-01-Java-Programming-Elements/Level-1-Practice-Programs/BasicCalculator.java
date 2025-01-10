// Creating a class to perform basic arithmetic operations
import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        // Display the results
        System.out.println("The addition, subtraction, multiplication and division value of two numbers " +
                           number1 + " and " + number2 + " is " + addition + ", " + subtraction + 
                           ", " + multiplication + ", and " + division);
    }
}
