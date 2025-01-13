//import scanner class
import java.util.Scanner;

// Class to check reverse and palindrome properties of numbers
class DuckAndPalindromeChecker {

    //Method to count the digits in a number
    public static int countDigits(int number) {
		
		//count the digit in number
        int count = String.valueOf(Math.abs(number)).length();
		//return count 
		return count;
    }

    //method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number){
		
		//Convert number to string
        String numStr = String.valueOf(Math.abs(number));
		
		//array to store digit
        int[] digits = new int[numStr.length()];
		
		//convet number to digit array
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
		
		//return digit array
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits){
		
		//array to store reversed array
        int[] reversed = new int[digits.length];
		
		//loop for reverse array
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
		//return reversed array
        return reversed;
    }

    //method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        
		//loop for checking if array are equal
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
				return false;
        }
		//return true if loop completed means arrays are same
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
		
		// Get digits array
        int[] digits = getDigitsArray(number);
		
		//reverse the digits array
        int[] reversed = reverseArray(digits);
		
		//check original and reversed arrays
		boolean isPalindromeArray = areArraysEqual(digits, reversed);
		
		//return result
        return isPalindromeArray;
    }

    //Method to check if a number is a duck number
    public static boolean isDuckNumber(int number){
		
		// Get digits array
        int[] digits = getDigitsArray(number);
		
		//check if number is duck number or not
        for (int i = 1; i < digits.length; i++){ 
            if (digits[i] == 0) 
				return true;
        }
        return false;
    }
    
	//main method
    public static void main(String[] args){
		
		//create object of scanner
        Scanner input = new Scanner(System.in);

        //input from user
        System.out.print("Enter a number ");
        int number = input.nextInt();

        //display results
        System.out.println("Number- " + number + 
                           "\nCount of Digits- " + countDigits(number) +
                           "\nIs Palindrome- " + isPalindrome(number) +
                           "\nIs Duck Number- " + isDuckNumber(number));
		
		//close scanner
		input.close();
    }
}
