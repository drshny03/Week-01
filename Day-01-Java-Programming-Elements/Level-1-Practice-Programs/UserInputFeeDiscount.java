// Creating a class to calculate discounted fee for a university course with user input
import java.util.Scanner;

class UserInputFeeDiscount {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the fee and discount percentage
        System.out.print("Enter the fee amount: ");
        double fee = input.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculate discount amount and discounted fee
        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;
        
        // Display the discount amount and discounted fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
