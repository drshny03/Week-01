import java.util.Scanner;

public class VowelConsonantCounter {

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

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkChar(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method and get the result
        int[] counts = countVowelsAndConsonants(input);

        // Display the result
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        scanner.close();
    }
}
