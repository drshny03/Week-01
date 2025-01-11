import java.util.Scanner;

// Program to analyze the properties of 5 numbers and compare the first and last elements.
class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store the numbers
        int[] numbers = new int[5];

        // Input numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Check properties of each number
        for (int num : numbers) {
            if (num > 0) {
                // Check if positive number is even or odd
                System.out.println(num + " is positive and " + (num % 2 == 0 ? "even." : "odd."));
            } else if (num < 0) {
                System.out.println(num + " is negative."); // Negative number
            } else {
                System.out.println(num + " is zero."); // Zero value
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] == numbers[4]) {
            System.out.println("The first and last numbers are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("The first number is greater than the last.");
        } else {
            System.out.println("The first number is less than the last.");
        }

        input.close(); // Close Scanner object
    }
}
