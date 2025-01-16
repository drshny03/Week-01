// Program to remove duplicate characters from a string
public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Darshan Yadav Is Here";
        String result = "";
        boolean[] seen = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                result = result + ch;
                seen[ch] = true;
            }
        }

        System.out.println("Modified String: " + result);
    }
}
