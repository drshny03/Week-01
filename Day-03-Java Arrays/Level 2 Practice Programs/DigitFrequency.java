import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Array to store the frequency of each digit (0 to 9)
        int[] frequency = new int[10];

        // Count the frequency of each digit
        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display the frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
    }
}
