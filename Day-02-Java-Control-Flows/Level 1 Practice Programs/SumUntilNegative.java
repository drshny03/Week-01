import java.util.Scanner;

// Class to find the sum of numbers until user enters 0 or a negative number
class SumUntilNegative {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Initialize total sum
      double totalSum = 0.0;

      // Start infinite loop
      while (true) {
         double number = inputScanner.nextDouble();

         // Check if the entered number is 0 or negative
         if (number <= 0) {
            break;
         }

         // Add the number to total sum
         totalSum += number;
      }

      // Output the total sum
      System.out.println("Total sum: " + totalSum);

      // Close the scanner object
      inputScanner.close();
   }
}
