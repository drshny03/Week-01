import java.util.Scanner;

// Class to check if the first number is the smallest of three
class SmallestNumber {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get three numbers from the user
      int number1 = inputScanner.nextInt();
      int number2 = inputScanner.nextInt();
      int number3 = inputScanner.nextInt();

      // Check if the first number is the smallest
      boolean isSmallest = (number1 <= number2) && (number1 <= number3);

      // Output the result
      System.out.println("Is the first number the smallest? " + isSmallest);

      // Close the scanner object
      inputScanner.close();
   }
}
