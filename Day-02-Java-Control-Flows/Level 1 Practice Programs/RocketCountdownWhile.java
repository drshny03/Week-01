import java.util.Scanner;

// Class to perform a countdown for rocket launch using while loop
class RocketCountdownWhile {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the starting number for countdown
      int counter = inputScanner.nextInt();

      // Countdown using while loop
      while (counter > 0) {
         System.out.println("T-" + counter);
         counter--;  // Decrement counter
      }

      System.out.println("Launch!");

      // Close the scanner object
      inputScanner.close();
   }
}
