// Creating a class to compute travel details with user inputs
import java.util.Scanner;

class TravelComputationWithInputs {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter name, fromCity, viaCity, and toCity
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter the city from where you are traveling: ");
        String fromCity = input.nextLine();
        
        System.out.print("Enter the city via which you are traveling: ");
        String viaCity = input.nextLine();
        
        System.out.print("Enter the city to which you are traveling: ");
        String toCity = input.nextLine();
        
        // Prompt the user to enter distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double distanceFromToVia = input.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = input.nextDouble();
        
        // Prompt the user to enter time taken in minutes
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();
        
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();
        
        // Calculate the total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        
        // Display the result
        System.out.println("The total distance traveled by " + name + " from " + fromCity + " to " + toCity +
                           " via " + viaCity + " is " + totalDistance + " miles and the total time taken is " + totalTime + " minutes.");
    }
}
