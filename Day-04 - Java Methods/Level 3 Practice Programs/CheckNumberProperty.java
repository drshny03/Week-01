//import scanner class
import java.util.Scanner;

//class to check different properties of a number
class CheckNumberProperty{

    //method to check if a number is prime
    public static boolean isPrime(int number){
		
		//prime numbers are greater than 1
        if (number <= 1) 
			return false;
		
		//loop to check prime number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
	    //return true if prime
        return true; 
    }

    //method to check if a number is neon
    public static boolean isNeon(int number){
		
		//calculate square of number
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
		
		//check if sum equals the original number and return
        boolean isSame = sumOfDigits == number;
		return isSame;
    }

    //method to check if a number is spy
    public static boolean isSpy(int number){
		
		//declare and initialize sum and product
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit; 
            product *= digit;
            number /= 10;
        }
		//check if sum equals product
        boolean isSame = sum == product;
		
		//return results
		return isSame;
    }

    //method to check if a number is automorphic
    public static boolean isAutomorphic(int number){
		
		//calculate square of the number
        int square = number * number;
		
		//check if number is automorphic or not
        boolean isAutomorphicNumber =  String.valueOf(square).endsWith(String.valueOf(number));
		
		//return the result
		return isAutomorphicNumber;
    }

    //method to check if a number is buzz
    public static boolean isBuzz(int number){
		
		//check if number is buzz or not
		boolean isBuzzNumber = number % 7 == 0 || number % 10 == 7;
		
		//return the result
        return  isBuzzNumber;
    }

    // main method 
    public static void main(String[] args){
		
		//creat object of number
		Scanner input = new Scanner(System.in);
		
		//input number
		System.out.println("Enter a number");
        int number = input.nextInt();

        //check and display results
        System.out.println("Number " + number + "\nIs Prime " + isPrime(number) + "\nIs Neon " + isNeon(number) +
                   "\nIs Spy " + isSpy(number) + "\nIs Automorphic " + isAutomorphic(number) + 
                   "\nIs Buzz " + isBuzz(number));

		
		//close scanner
		input.close();
    }
}
