//import scanner class
import java.util.Scanner;

//class to analyze factors
class FactorAnalysis {

    //method to find all factors of a number
    public static int[] findFactors(int number){
		
		//count total factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++; 
        }

        //create a array to store factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i; 
            }
        }
		
		//return array of factors
        return factors; 
    }

    //method to find the greatest factor
    public static int findGreatestFactor(int number){
		
		//get factors
        int[] factors = findFactors(number);
		
		//get largest factor
		int largestFactor = factors[factors.length - 1];
		
		//return largest factor of number
        return largestFactor;
    }

    //method to find the sum of factors
    public static int findSumOfFactors(int number){
		
		//get factors
        int[] factors = findFactors(number);
		
		//calculate total sum using a loop
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
		
		//return total sum
        return sum;
    }

    //method to find the product of factors
    public static int findProductOfFactors(int number){
		
		//get factors
        int[] factors = findFactors(number);
		
		//calculate product of factor
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
		//return factor
        return product;
    }

    //method to find the product of cubes of factors
    public static long findProductOfCubeOfFactors(int number){
		//get factors
        int[] factors = findFactors(number);
		
		//calculate product of cubes of factor
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
		
		//return result
        return product;
    }

    //method to check if a number is perfect
    public static boolean isPerfectNumber(int number) {
		
		//find and return if number is perfect
        int sumOfProperDivisors = findSumOfFactors(number) - number;
        boolean isPerfect = sumOfProperDivisors == number;
        return isPerfect;		
    }

    //method to check if a number is abundant
    public static boolean isAbundantNumber(int number) {
		
		//check if number is abundant
        int sumOfProperDivisors = findSumOfFactors(number) - number;
        boolean isAbundant = sumOfProperDivisors > number;
		return isAbundant;
    }

    //method to check if a number is deficient
    public static boolean isDeficientNumber(int number){
		
		//check and return if number is deficient
        int sumOfProperDivisors = findSumOfFactors(number) - number;
        boolean isDeficient = sumOfProperDivisors < number;
		return isDeficient;
    }

    //method to check if a number is strong
    public static boolean isStrongNumber(int number){
		
		//get digits
        int[] digits = getDigitsArray(number);
		
		//add factorial of each digit to sum
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
		
		////check if sum equals the number
        boolean isEqual = (sum == number); 
		
		//return result
		return isEqual;
    }

    //method to calculate factorial of a digit
    private static int factorial(int num) {
		
		//calculate factor
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
		
		//return factor
        return fact;
    }

    //method to get digits array
    private static int[] getDigitsArray(int number) {
		
		//convert number to a digit array
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
		
		//return digit array
        return digits;
    }

    //main method
    public static void main(String[] args) {
        
        //create object of scanner
		Scanner input = new Scanner(System.in);
		
		//input number
		System.out.println("enter a number");
		int number = input.nextInt();
		
        //display factors
        System.out.print("Factors- ");
        int[] factors = findFactors(number);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        //display results
        System.out.println("Greatest Factor- " + findGreatestFactor(number) + 
                           "\nSum of Factors- " + findSumOfFactors(number) +
                           "\nProduct of Factors- " + findProductOfFactors(number) +
                           "\nProduct of Cubes of Factors- " + findProductOfCubeOfFactors(number) +
                           "\nIs Perfect Number- " + isPerfectNumber(number) +
                           "\nIs Abundant Number- " + isAbundantNumber(number) +
                           "\nIs Deficient Number- " + isDeficientNumber(number) +
                           "\nIs Strong Number- " + isStrongNumber(number));
        //close scanner 
		input.close();
    }
}
