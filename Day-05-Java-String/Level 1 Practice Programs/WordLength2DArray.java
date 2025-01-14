import java.util.Scanner;

public class WordLength2DArray {

    public static String[] splitText(String text) {
        int wordCount = 1; 
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int index = 0, start = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[index++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static int getLength(String word) {
        int length = 0;
        for (char c : word.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[][] generate2DArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void displayResult(String[][] array) {
        System.out.println("Word\tLength");
        System.out.println("--------------");
        for (String[] row : array) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();

        String[] words = splitText(text);
        String[][] wordLengthArray = generate2DArray(words);

        displayResult(wordLengthArray);
    }
}
