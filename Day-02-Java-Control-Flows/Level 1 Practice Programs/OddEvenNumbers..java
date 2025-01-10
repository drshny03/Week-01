import java.util.Scanner;

// Class to print odd and even numbers between 1 to the entered number
class OddEvenNumbers {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the number from the user
      int number = inputScanner.nextInt();

      // Check if it's a natural number
      if (number > 0) {
         // Print odd and even numbers between 1 and the entered number
         for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
               System.out.println(i + " is even.");
            } else {
               System.out.println(i + " is odd.");
            }
         }
      } else {
         System.out.println("The number is not a natural number.");
      }

      // Close the scanner object
      inputScanner.close();
   }
}
