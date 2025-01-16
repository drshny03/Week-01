
//import scanner class
import java.util.Scanner;

// program to to check if a text is palindrome
class PalindromeChecker {

    // method to reverse a string
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversedArray = new char[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = text.charAt(length - 1 - i);
        }
        return reversedArray;
    }

    // Logic 1 iterative
    public static boolean isPalindromeIterative(String text) {
        // get first and last index
        int start = 0, end = text.length() - 1;
        // iterate loop to check if string palindrome
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        // return true means string is palindrome
        return true;
    }

    // Logic 2 recursive
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3 character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        // convert to a character array
        char[] originalArray = text.toCharArray();

        // Get reversed character array
        char[] reversedArray = reverseString(text);

        // compare characters in the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // take user input
        System.out.println("Enter a string");
        String palindromeText = input.nextLine();

        // check palindrom
        boolean iterativePalindrome = isPalindromeIterative(palindromeText);
        boolean recursivePalindrome = isPalindromeRecursive(palindromeText, 0, palindromeText.length() - 1);
        boolean arrayPalindrome = isPalindromeUsingArrays(palindromeText);
        // display reuslt
        if(iterativePalindrome){
            System.out.println(palindromeText + " is palindrome");
        }
        System.out.println("Iterative Palindrome Check- " + iterativePalindrome +
                "\nRecursive Palindrome Check -" + recursivePalindrome +
                "\nArray-Based Palindrome Check- " + arrayPalindrome);

        // close scanner
        input.close();
    }
}
