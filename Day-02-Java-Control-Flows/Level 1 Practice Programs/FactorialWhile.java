import java.util.Scanner;

// Class to calculate the factorial of a number using while loop
class FactorialWhile {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the number from the user
      int number = inputScanner.nextInt();

      // Check if the number is positive
      if (number >= 0) {
         // Calculate factorial using while loop
         int factorial = 1;
         int i = 1;
         while (i <= number) {
            factorial *= i;
            i++;
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
