import java.util.Scanner;

public class TextToLowercase {

    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }
            result += ch;
        }
        return result;
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
        String text = input.nextLine();

        String builtInLowerCase = text.toLowerCase();
        String customLowerCase = convertToLowerCase(text);

        boolean areEqual = compareStrings(builtInLowerCase, customLowerCase);

        System.out.println("Built-in toLowerCase result: " + builtInLowerCase);
        System.out.println("Custom method result: " + customLowerCase);
        System.out.println("Are both results the same? " + areEqual);
    }
}
