// Program to find the longest word in a sentence
public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Darshan Yadav Is Here";
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Longest Word: " + longestWord);
    }
}
