// Program to compare two strings lexicographically
public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order.");
        } else {
            System.out.println(str1 + " comes after " + str2 + " in lexicographical order.");
        }
    }
}
