import java.util.Scanner;

class SingleLeapYear {
   public static void main(String[] args) {
      // Create a Scanner Object to take user input
      Scanner input = new Scanner(System.in);

      // Get the year input from the user
      int year = input.nextInt();

      // Check if the year is valid (greater than or equal to 1582) and if it is a leap year
      if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
         System.out.println(year + " is a Leap Year.");
      } else if (year >= 1582) {
         System.out.println(year + " is not a Leap Year.");
      } else {
         System.out.println("Year must be greater than or equal to 1582.");
      }

      // Closing the Scanner stream
      input.close();
   }
}