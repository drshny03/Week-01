// Program to remove a specific character from a string
public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Darshan Yadav";
        char toRemove = 'a';
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != toRemove) {
                result += ch;
            }
        }

        System.out.println("Modified String: " + result);
    }
}
