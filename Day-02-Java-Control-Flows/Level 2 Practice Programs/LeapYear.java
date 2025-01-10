
import java.util.Scanner;

class LeapYear {
   public static void main(String[] args) {
      // Create a Scanner Object to take user input
      Scanner input = new Scanner(System.in);

      // Get the year input from the user
      int year = input.nextInt();

      // Check if the year is before the Gregorian calendar year
      if (year >= 1582) {
         // Check if the year is divisible by 4
         if (year % 4 == 0) {
            // Further check if the year is divisible by 100
            if (year % 100 == 0) {
               // Check if the year is divisible by 400
               if (year % 400 == 0) {
                  System.out.println(year + " is a Leap Year.");
               } else {
                  System.out.println(year + " is not a Leap Year.");
               }
            } else {
               System.out.println(year + " is a Leap Year.");
            }
         } else {
            System.out.println(year + " is not a Leap Year.");
         }
      } else {
         System.out.println("Year must be greater than or equal to 1582.");
      }

      // Closing the Scanner stream
      input.close();
   }
}

