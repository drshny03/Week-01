import java.util.Scanner;

// Class to calculate bonus based on years of service
class EmployeeBonus {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get salary and years of service from the user
      double salary = inputScanner.nextDouble();
      int yearsOfService = inputScanner.nextInt();

      // Check if years of service are more than 5
      if (yearsOfService > 5) {
         // Calculate the bonus
         double bonus = salary * 0.05;
         System.out.println("Bonus: " + bonus);
      } else {
         System.out.println("No bonus available for less than 5 years of service.");
      }

      // Close the scanner object
      inputScanner.close();
   }
}
