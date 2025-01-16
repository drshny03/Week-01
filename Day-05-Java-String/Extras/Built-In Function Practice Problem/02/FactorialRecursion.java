import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int number = getInput("Enter a number: ");
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
