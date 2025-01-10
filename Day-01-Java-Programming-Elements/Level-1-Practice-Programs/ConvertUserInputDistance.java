// Creating a class to convert distance in kilometers to miles based on user input
import java.util.Scanner;

class ConvertUserInputDistance {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();
        
        // Convert kilometers to miles
        double miles = kilometers / 1.6;
        
        // Display the converted distance
        System.out.println("The total miles is " + miles + " miles for the given " + kilometers + " km");
    }
}
