import java.util.Scanner;

// Class to find the sum of numbers until the user enters 0
class SumUntilZero {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Initialize total sum
      double totalSum = 0.0;

      // Start loop to get numbers
      double number;
      while (true) {
         number = inputScanner.nextDouble();

         // Check if the entered number is 0
         if (number == 0) {
            break;
         }

         // Add the number to totalSum
         totalSum += number;
      }

      // Output the total sum
      System.out.println("Total sum: " + totalSum);

      // Close the scanner object
      inputScanner.close();
   }
}
