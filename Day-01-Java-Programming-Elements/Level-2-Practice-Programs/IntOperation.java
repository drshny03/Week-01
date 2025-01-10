// Creating a class to perform integer operations on three variables
import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();
        
        // Perform integer operations and store results
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        
        // Display the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
