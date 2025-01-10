// Creating a class to calculate the side of a square from its perimeter
import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
        // Calculate the side of the square
        double side = perimeter / 4;
        
        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
