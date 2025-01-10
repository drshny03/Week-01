// Creating a class to swap two numbers
import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        
        // Swap the numbers
        number1= number1 - number2;
        number2 = number1 + number2;
        number1 = number2 - number1;
        
        // Display the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
