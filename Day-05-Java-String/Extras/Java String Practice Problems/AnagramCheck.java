// Simple program to check if two strings are anagrams
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        // Check lengths
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }

        // Count characters
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        // Verify counts
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("The strings are not anagrams.");
                return;
            }
        }

        System.out.println("The strings are anagrams.");
    }
}
