import java.util.Scanner;

// Class to check if a person can vote based on age
class VotingEligibility {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get the age of the person
      int age = inputScanner.nextInt();

      // Check if the person can vote
      if (age >= 18) {
         System.out.println("The person's age is " + age + " and can vote.");
      } else {
         System.out.println("The person's age is " + age + " and cannot vote.");
      }

      // Close the scanner object
      inputScanner.close();
   }
}
