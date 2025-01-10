// Creating a class to calculate the area of a triangle in square inches and square centimeters
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the base and height
        System.out.print("Enter the base of the triangle in centimeters: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in centimeters: ");
        double height = input.nextDouble();
        
        // Calculate the area of the triangle in square centimeters
        double areaCm = 0.5 * base * height;
        
        // Convert the area to square inches (1 inch = 2.54 cm)
        double areaInches = areaCm / Math.pow(2.54, 2);
        
        // Display the area
        System.out.println("The area of the triangle is " + areaCm + " square centimeters and " +
                           areaInches + " square inches");
    }
}
