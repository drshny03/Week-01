import java.util.Scanner;

// Class to find the multiplication table of a number from 6 to 9
class MultiplicationTable {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the number from the user
      int number = inputScanner.nextInt();

      // Print multiplication table for 6 to 9
      for (int i = 6; i <= 9; i++) {
         System.out.println(number + " * " + i + " = " + (number * i));
      }

      // Close the scanner object
      inputScanner.close();
   }
}
