import java.util.Scanner;

// Class to check if a number is divisible by 5
class DivisibleByFive {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the number from the user
      int number = inputScanner.nextInt();

      // Check if number is divisible by 5
      boolean isDivisibleByFive = number % 5 == 0;

      // Output the result
      System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleByFive);

      // Close the scanner object
      inputScanner.close();
   }
}
