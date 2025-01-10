// Creating a class to calculate the total price of items
import java.util.Scanner;

class TotalPriceCalculator {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the unit price and quantity
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();
        
        System.out.print("Enter the quantity of items: ");
        int quantity = input.nextInt();
        
        // Calculate the total price
        double totalPrice = unitPrice * quantity;
        
        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
