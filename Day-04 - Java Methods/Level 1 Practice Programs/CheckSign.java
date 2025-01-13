import java.util.Scanner;

public class CheckSign {

    // Method to check if number is positive, negative, or zero
    public static int checkSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int result = checkSign(number);

        System.out.println("result : " + result);

        input.close();
    }
}
