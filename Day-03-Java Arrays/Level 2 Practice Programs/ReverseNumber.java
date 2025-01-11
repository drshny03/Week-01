import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = (int) Math.log10(number) + 1;
        int[] digits = new int[digitCount];
        int index = 0;

        // Store digits in an array
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display the digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
    }
}
