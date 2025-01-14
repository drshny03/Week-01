import java.util.Scanner;

public class TextToUppercase {

    public static String convertToUpperCase(String input) {
        String upperCaseText = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }
            upperCaseText += ch; // Concatenate to the result string
        }
        return upperCaseText;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String string = input.nextLine();

        String upperCaseText = string.toUpperCase();
        String customUpperCaseText = convertToUpperCase(string);

        boolean isSame = compareStrings(upperCaseText, customUpperCaseText);

        System.out.println("Built-in toUpperCase result: " + upperCaseText);
        System.out.println("User method result: " + customUpperCaseText);
        System.out.println("Are both results the same? " + isSame);
    }
}
