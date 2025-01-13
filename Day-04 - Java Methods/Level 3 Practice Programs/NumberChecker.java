//import scanner class
import java.util.Scanner;

class NumberChecker{

    // Method to count the digits
    public static int countDigits(int number) {
		//count the number of digits
		int numberCount = String.valueOf(Math.abs(number)).length();
        
		//return number count
		return numberCount;
    }

    //method to store digits of number in array
    public static int[] getDigitsArray(int number) {
		
		// convert number to string
        String numStr = String.valueOf(Math.abs(number));
		
		//array to store digits
		int size = numStr.length();
        int[] digits = new int[size]; 
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
		//return digits array
        return digits;
    }

    //method to check if a number is a Duck number
    public static boolean isDuckNumber(int number) {
		
		//number to string
        String numStr = String.valueOf(Math.abs(number));
		
		//check if number contain non zero digit
		boolean isDuck = numStr.contains("0");
		
        return isDuck;
    }

    //Method to check Armstrong number
    public static boolean isArmstrongNumber(int number) {
		
		//call get digits array
        int[] digits = getDigitsArray(number);
		
		// Get the number of digits
        int power = digits.length; 
		
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power); 
        }
		
		// Check if sum equals the original number
        boolean isSame = (sum == number);
		
		//return result
		return isSame;
    }
 
    //Method to find largest and second-largest elements
    public static int[] findLargestAndSecondLargest(int[] digits) {
		
		//Initialize largest and second-largest variable
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        //iterate the array
        for (int digit : digits) {
            if (digit > largest) {
				//update second-largest 
                secondLargest = largest;
				//update largest 
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
				//update second-largest
                secondLargest = digit;
            }
        }

        // Return largest and second largest
        int[] twoLargestNumber = new int[]{largest, secondLargest};
		return twoLargestNumber;
    }
	
	//method to find smallest and second-smallest
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
		
		//Initialize smallest and second-smallest variable
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Iterate the array
        for (int digit : digits) {
            if (digit < smallest) {
				// Update second smallest
                secondSmallest = smallest;
				//Update smallest
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
				// Update second smallest
                secondSmallest = digit;
            }
        }

        // Return smallest and second smallest
        int[] twoSmallestNumber = new int[]{smallest, secondSmallest};
		return twoSmallestNumber;
    }
	
    //main method
    public static void main(String[] args) {
		// create object of scanner 
		Scanner input = new Scanner(System.in);
		
		//input number
		System.out.println("Enter a number");
        int number = input.nextInt();

        // Check and display results
        System.out.println("Number " + number + "\nIs Duck Number " + isDuckNumber(number) + "\nIs Armstrong Number " + isArmstrongNumber(number));
        
		//get digits array
        int[] digits = getDigitsArray(number);

        //find largest and second largest
        int[] largestResults = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestResults[0] + "\nSecond Largest Digit: " + largestResults[1]);
        

        //find smallest and second smallest
        int[] smallestResults = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestResults[0] + "\nSecond Smallest Digit: " + smallestResults[1]);
    
	    //close scanner 
		input.close();
    }
}
