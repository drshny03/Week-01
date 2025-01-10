// Creating a class to perform double operations on three variables
import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        
        // Perform double operations and store results
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        
        // Display the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
