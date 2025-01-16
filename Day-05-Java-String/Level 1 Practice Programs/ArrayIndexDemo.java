import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException() {
        Scanner input = new Scanner(System.in);
        String[] names = {"Darshan", "Yadav", "Rajveer", "Kajle"};
        System.out.print("Enter an index to pick a name: ");
        int index = input.nextInt();
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    public static void handleException() {
        Scanner input = new Scanner(System.in);
        String[] names = {"Darshan", "Yadav", "Rajveer", "Kajle"};
        System.out.print("Enter an index to pick a name: ");
        int index = input.nextInt();
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That index is out of bounds. Try using a valid.");
        } catch (ArrayOutOfBoundException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Let's try to generate an exception:");
        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an issue: " + e.getMessage());
        }

        System.out.println("\n Handle the exception:");
        handleException();
    }
}
