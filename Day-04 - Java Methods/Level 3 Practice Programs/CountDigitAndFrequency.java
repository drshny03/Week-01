//import scanner class
import java.util.Scanner;

class CountDigitAndFrequency {

    //Method to count the digits in the number
    public static int countDigits(int number) {
		//count digits in the number
		int count = String.valueOf(Math.abs(number)).length();
		
		//return count
        return count;
    }

    //method to store the digits
    public static int[] getDigitsArray(int number) {
		
		//Convert number to string
        String numStr = String.valueOf(Math.abs(number));
		
		//array to store digit
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
		// Return digits array
        return digits;
    }

    // Method to find the sum of the digits
    public static int findSumOfDigits(int number) {
		
		// Get digits array
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
		//return sum
        return sum;
    }

    //method to find the sum of the squares of the digits
    public static int findSumOfSquaresOfDigits(int number){
		
		// Get digits array
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
		
		//return sum
        return sum;
    }

    //method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
		
		// Get sum of digits
        int sumOfDigits = findSumOfDigits(number);
		
		//check if harshad number
        boolean isHarshad =  number % sumOfDigits == 0;
		
		//return results 
		return isHarshad;
    }

    // Method to find the frequency of digit in the number
    public static int[][] findDigitFrequency(int number) {
		
		// Get digits array
        int[] digits = getDigitsArray(number);
		
		// Create a 2D array to store digit and frequency
        int[][] frequency = new int[10][2];

        // Initialize the digit
        for (int i = 0; i < 10; i++){
			//set digit in first column
            frequency[i][0] = i;
        }

        //count frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        //return 2D array
        return frequency;
    }

    //main method
    public static void main(String[] args){
		
		//object of scanner class
        Scanner input = new Scanner(System.in);

        // Input number 
        System.out.print("Enter a number ");
        int number = input.nextInt();

        // Call methods and display results
        System.out.println("Number- " + number +
                "\nCount of Digits- " + countDigits(number) +
                "\nSum of Digits- " + findSumOfDigits(number) +
                "\nSum of Squares of Digits- " + findSumOfSquaresOfDigits(number) +
                "\nIs Harshad Number- " + isHarshadNumber(number));

        //display frequency
        System.out.println("Digit Frequency-");
        int[][] frequency = findDigitFrequency(number);
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + "- " + frequency[i][1] + " time");
            }
        }
		
		//close scanner
		input.close();
    }
}
