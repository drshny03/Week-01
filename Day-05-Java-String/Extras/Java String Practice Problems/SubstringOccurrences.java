// Program to count occurrences of a substring in a string
public class SubstringOccurrences {
    public static void main(String[] args) {
        String str = "Darshan Yadav Is Here";
        String sub = "Da";
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}
