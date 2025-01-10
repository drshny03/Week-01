// Creating a class to convert distance from feet to yards and miles
import java.util.Scanner;

class ConvertDistanceFToY {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceFeet = input.nextDouble();
        
        // Convert distance to yards and miles
        double distanceYards = distanceFeet / 3;
        double distanceMiles = distanceYards / 1760;
        
        // Display the results
        System.out.println("The distance in feet is " + distanceFeet + ", in yards is " +
                           distanceYards + ", and in miles is " + distanceMiles);
    }
}
