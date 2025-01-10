import java.util.Scanner;

// Class to check if the number is a natural number and calculate the sum
class NaturalNumberSum {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the number from the user
      int number = inputScanner.nextInt();

      // Check if the number is a natural number
      if (number > 0) {
         // Calculate the sum of n natural numbers
         int sum = number * (number + 1) / 2;
         System.out.println("The sum of " + number + " natural numbers is " + sum);
      } else {
         System.out.println("The number " + number + " is not a natural number");
      }

      // Close the scanner object
      inputScanner.close();
   }
}
