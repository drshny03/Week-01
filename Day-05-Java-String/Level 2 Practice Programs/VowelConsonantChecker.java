import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkChar(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase
        if (ch >= 'a' && ch <= 'z') {  // Check if it is a letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch); // Character
            result[i][1] = checkChar(ch);     // Type
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] result) {
        System.out.println("Character\tType");
        System.out.println("--------------------------");
        for (String[] row : result) {
            System.out.printf("%s\t\t%s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find vowels and consonants
        String[][] result = findVowelsAndConsonants(input);

        // Display the result
        displayResult(result);

        scanner.close();
    }
}