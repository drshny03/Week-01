import java.util.Scanner;

// Class to perform a countdown for rocket launch using for loop
class RocketCountdownFor {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the starting number for countdown
      int counter = inputScanner.nextInt();

      // Countdown using for loop
      for (int i = counter; i > 0; i--) {
         System.out.println("T-" + i);
      }

      System.out.println("Launch!");

      // Close the scanner object
      inputScanner.close();
   }
}
