import java.util.Scanner;

// Program to find and display factors of a number.
class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return; // Exit for invalid input
        }

        // Array to store factors and initialization
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    // Resize the array if more space is needed
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        input.close(); // Close Scanner object
    }
}
