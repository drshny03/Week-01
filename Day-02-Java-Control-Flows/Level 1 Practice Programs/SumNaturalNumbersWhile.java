import java.util.Scanner;

// Class to find the sum of n natural numbers using while loop
class SumNaturalNumbersWhile {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the natural number from the user
      int n = inputScanner.nextInt();

      // Check if the number is a natural number
      if (n > 0) {
         // Calculate sum using formula
         int sumFormula = n * (n + 1) / 2;

         // Calculate sum using while loop
         int sumLoop = 0;
         int counter = 1;
         while (counter <= n) {
            sumLoop += counter;
            counter++;
         }

         // Compare the two results
         System.out.println("Sum using formula: " + sumFormula);
         System.out.println("Sum using while loop: " + sumLoop);

         // Check if both results are the same
         if (sumFormula == sumLoop) {
            System.out.println("Both computations match!");
         } else {
            System.out.println("There is a mismatch between computations.");
         }
      } else {
         System.out.println("The number is not a natural number.");
      }

      // Close the scanner object
      inputScanner.close();
   }
}
