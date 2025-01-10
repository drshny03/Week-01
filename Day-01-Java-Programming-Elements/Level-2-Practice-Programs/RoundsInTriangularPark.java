// Creating a class to calculate the number of rounds to complete 5 km in a triangular park
import java.util.Scanner;

class RoundsInTriangularPark {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the three sides of the triangle
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = input.nextDouble();
        
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
        // Calculate the number of rounds to complete 5 km
        double rounds = 5000 / perimeter;
        
        // Display the result
        System.out.println("The total number of rounds the athlete will run to complete 5 km is " + rounds);
    }
}
