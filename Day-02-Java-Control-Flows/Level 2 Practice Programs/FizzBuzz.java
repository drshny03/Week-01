import java.util.Scanner;

class FizzBuzz {
   public static void main(String[] args) {
      // Create a Scanner object to take user input
      Scanner input = new Scanner(System.in);

      // Get the number input from the user
      int number = input.nextInt();

      // Check if the number is a positive integer
      if (number > 0) {
         // Loop through all numbers from 1 to the entered number
         for (int i = 1; i <= number; i++) {
            // Check if the number is divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
               System.out.println("Fizz");
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
               System.out.println("Buzz");
            } else {
               // Print the number if it's not divisible by 3 or 5
               System.out.println(i);
            }
         }
      } else {
         System.out.println("Please enter a positive number.");
      }

      // Close the scanner stream
      input.close();
   }
}