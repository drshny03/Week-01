import java.util.Scanner;

public class TextSplitComparison {

    // Method to find the length of a string without using built-in length() method
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        // Count the number of spaces to determine word count
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Number of words is spaces + 1
        String[] words = new String[spaceCount + 1];
        int start = 0;
        int wordIndex = 0;

        // Extract words using space indexes
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }

        // Add the last word
        words[wordIndex] = text.substring(start);
        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Split the text using custom method
        String[] customSplitResult = customSplit(text);

        // Split the text using built-in split() method
        String[] builtInSplitResult = text.split(" ");

        // Compare the results
        boolean isEqual = compareArrays(customSplitResult, builtInSplitResult);

        // Display the results
        System.out.println("Custom Split Result: ");
        for (String word : customSplitResult) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result: ");
        for (String word : builtInSplitResult) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nAre both results equal? " + isEqual);
    }
}
