// Creating a class to calculate Simple Interest
import java.util.Scanner;

class SimpleInterestCalculation {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter principal, rate, and time
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        
        System.out.print("Enter the time in years: ");
        double time = input.nextDouble();
        
        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
    }
}
