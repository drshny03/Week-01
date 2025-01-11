import java.util.Scanner;

// Program to store up to 10 values in an array until the user enters 0 or a negative number.
class StroreAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store up to 10 numbers
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or a negative number to stop):");

        // Input loop to get numbers
        while (true) {
            System.out.print("Number: ");
            double num = input.nextDouble();

            if (num <= 0 || index == numbers.length) {
                break; // Exit if the number is non-positive or array limit reached
            }

            numbers[index++] = num; // Store the number in the array
        }

        // Calculate the sum of all valid numbers
        for (int i = 0; i < index; i++) {
            total = total +  numbers[i];
        }

        // Display all stored numbers and their sum
        System.out.println("Stored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum: " + total);

        input.close(); // Close Scanner object
    }
}