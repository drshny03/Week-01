// Simple program to replace a word in a sentence
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence and words
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        // Replace the word
        String modifiedSentence = sentence.replace(oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
