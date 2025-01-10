import java.util.Scanner;

// Class to check which number is the largest of the three
class LargestNumber {
   public static void main(String[] args) {
      Scanner inputScanner = new Scanner(System.in);

      // Get three numbers from the user
      int number1 = inputScanner.nextInt();
      int number2 = inputScanner.nextInt();
      int number3 = inputScanner.nextInt();

      // Check which number is the largest
      boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
      boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
      boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);

      // Output the result
      System.out.println("Is the first number the largest? " + isFirstLargest);
      System.out.println("Is the second number the largest? " + isSecondLargest);
      System.out.println("Is the third number the largest? " + isThirdLargest);

      // Close the scanner object
      inputScanner.close();
   }
}
