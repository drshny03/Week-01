import java.util.Scanner;

// Program to implement FizzBuzz logic and display results.
class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return; // Exit for invalid input
        }

        // Create a String array to store results
        String[] results = new String[number];

        // Apply FizzBuzz logic
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            } else {
                results[i - 1] = String.valueOf(i);
            }
        }

        // Display results
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        input.close(); // Close Scanner object
    }
}
