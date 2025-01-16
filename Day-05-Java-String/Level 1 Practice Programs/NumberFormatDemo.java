import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to a number: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        System.out.println("Converted number: " + number);
    }

    public static void handleException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to a number: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Input is not a valid number.");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method to generate the exception:");
        try {
            generateException();
        } catch (NumberFormatException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
        System.out.println("\nCalling method to handle the exception:");
        handleException();
    }
}
