import java.util.Scanner;

// Class to check if a number is positive, negative, or zero
class NumberSign {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the number from the user
      int number = inputScanner.nextInt();

      // Check the sign of the number
      if (number > 0) {
         System.out.println("The number is positive.");
      } else if (number < 0) {
         System.out.println("The number is negative.");
      } else {
         System.out.println("The number is zero.");
      }

      // Close the scanner object
      inputScanner.close();
   }
}
