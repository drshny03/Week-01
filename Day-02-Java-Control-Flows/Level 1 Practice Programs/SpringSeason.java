import java.util.Scanner;

// Class to check if the date falls in the Spring Season
class SpringSeason {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the month and day from the user
      int month = inputScanner.nextInt();
      int day = inputScanner.nextInt();

      // Check if the date falls in Spring Season (March 20 to June 20)
      if ((month == 3 && day >= 20) || (month == 4 || month == 5) || (month == 6 && day <= 20)) {
         System.out.println("It's a Spring Season.");
      } else {
         System.out.println("Not a Spring Season.");
      }

      // Close the scanner object
      inputScanner.close();
   }
}
