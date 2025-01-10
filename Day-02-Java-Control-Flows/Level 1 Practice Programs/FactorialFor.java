import java.util.Scanner;

// Class to calculate the factorial of a number using for loop
class FactorialFor {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the number from the user
      int number = inputScanner.nextInt();

      // Check if the number is positive
      if (number >= 0) {
         // Calculate factorial using for loop
         int factorial = 1;
         for (int i = 1; i <= number; i++) {
            factorial *= i;
         }

         // Output the result
         System.out.println("Factorial of " + number + " is " + factorial);
      } else {
         System.out.println("Factorial is not defined for negative numbers.");
      }

      // Close the scanner object
      inputScanner.close();
   }
}
