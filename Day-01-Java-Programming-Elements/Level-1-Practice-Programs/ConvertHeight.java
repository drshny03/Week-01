// Creating a class to convert height from centimeters to feet and inches
import java.util.Scanner;

class ConvertHeight {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter height in centimeters
        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();
        
        // Convert height to feet and inches
        double heightInches = heightCm / 2.54;
        int heightFeet = (int) (heightInches / 12);
        double remainingInches = heightInches % 12;
        
        // Display the height in centimeters, feet, and inches
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + remainingInches);
    }
}
