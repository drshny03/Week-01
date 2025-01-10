import java.util.Scanner;

// Class to create a basic calculator using switch-case
class Calculator {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter the first number, operator, and second number
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        
        // Variable to store the result of the calculation
        double result = 0;
        
        // Switch-case to perform the calculation based on the operator
        switch(op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if(second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        
        // Output the result of the calculation
        System.out.println("The result of " + first + " " + op + " " + second + " is: " + result);
        
        // Close the scanner object to prevent memory leakage
        input.close();
    }
}