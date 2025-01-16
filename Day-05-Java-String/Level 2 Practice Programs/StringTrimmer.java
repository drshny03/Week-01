import java.util.Scanner;

public class StringTrimmer {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the start index (first non-space character)
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Find the end index (last non-space character)
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
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
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // Trim spaces using the custom method
        int[] trimIndices = trimSpaces(input);
        String trimmedCustom = createSubstring(input, trimIndices[0], trimIndices[1]);

        // Trim spaces using built-in method
        String trimmedBuiltIn = input.trim();

        // Compare the results
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("\nOriginal String: \"" + input + "\"");
        System.out.println("Custom Trimmed String: \"" + trimmedCustom + "\"");
        System.out.println("Built-In Trimmed String: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        scanner.close();
    }
}