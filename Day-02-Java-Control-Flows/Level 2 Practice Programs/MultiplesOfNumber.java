import java.util.Scanner;

class MultiplesOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number input
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Loop through from 100 down to 1 to find multiples of the number
        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }

        // Close the scanner stream
        input.close();
    }
}