// Creating a class to convert weight in pounds to kilograms
import java.util.Scanner;

class PoundsToKilograms {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        
        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds * 2.2;
        
        // Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKilograms);
    }
}
