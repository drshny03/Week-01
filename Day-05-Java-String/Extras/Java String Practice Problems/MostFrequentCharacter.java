// Program to find the most frequent character in a string
public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "Darshan Yadav";
        int[] frequency = new int[256];
        char mostFrequent = ' ';
        int maxCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency[ch]++;
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: " + mostFrequent);
    }
}
