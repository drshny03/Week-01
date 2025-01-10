import java.util.Scanner;

class PrimeNumberChecker {
   public static void main(String[] args) {
      // Create a Scanner object to take user input
      Scanner input = new Scanner(System.in);

      // Get the number input from the user
      int number = input.nextInt();

      // Check if the number is greater than 1 (prime numbers are greater than 1)
      if (number > 1) {
         boolean isPrime = true; // Assume the number is prime

         // Loop through numbers from 2 to the square root of the number
         for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by i, it's not a prime number
            if (number % i == 0) {
               isPrime = false; // Not prime
               break; // Exit the loop as we already know it's not prime
            }
         }

         // Output result based on isPrime value
         if (isPrime) {
            System.out.println(number + " is a prime number.");
         } else {
            System.out.println(number + " is not a prime number.");
         }
      } else {
         System.out.println(number + " is not a prime number.");
      }

      // Close the scanner stream
      input.close();
   }
}