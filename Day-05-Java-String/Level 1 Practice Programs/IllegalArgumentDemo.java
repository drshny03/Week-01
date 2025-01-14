import java.util.Scanner;

public class IllegalArgumentDemo {

   
    public static void generateException() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 

        
        System.out.println("Trying to get a substring with invalid indices...");
        System.out.println(input.substring(5, 3)); 
    }

   public static void handleException() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 
        try {
          
            System.out.println("Trying to get a substring with invalid indices...");
            System.out.println(input.substring(5, 3)); 
        } catch (IllegalArgumentException e) {
            
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Calling method to generate the exception:");
        try {
            generateException();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

      
        System.out.println("\nCalling method to handle the exception:");
        handleException(); 
    }
}
