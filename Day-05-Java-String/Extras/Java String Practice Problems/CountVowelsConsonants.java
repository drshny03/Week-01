// Program to count vowels and consonants in a string
public class CountVowelsConsonants {
    public static void main(String[] args) {
        String input = "Darshan Yadav is Here";
        int vowels = 0, consonants = 0;

        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
