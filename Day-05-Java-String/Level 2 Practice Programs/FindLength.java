//import scanner class
import java.util.Scanner;

class FindLength{
	
	//method to find length using user define method
	public static int findTextLength(String text){
		//variable to store length 
		int length = 0;
		
		//variable to track index
		int index = 0;
		
		//infinite loop to find length
		while(true){
			try{
				//get character at index
				text.charAt(index++);
				//increment length by 1
				length++;
			}catch(StringIndexOutOfBoundsException exception){
				System.out.println("End of the text");
				//break the loop
				break;
			}
		}
		return length;
	}
	
	//method to display both length
	public static void displayResult(int lengthUsingUserMethod, int lengthUsingBuiltIn){
		//print statement
		System.out.print("length using user define method " + lengthUsingUserMethod + "\n length using built in method " + lengthUsingBuiltIn);
	}
	
	//main method
	public static void main(String[] args){
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//take input from user
		System.out.println("enter a text");
		String text = input.next();
		
		//find length using user define method
		int lengthUsingUserMethod = findTextLength(text);
		
		//find length using built in method
		int lengthUsingBuiltIn = text.length();
		
		//display result
		displayResult(lengthUsingUserMethod, lengthUsingBuiltIn);
		
		//close scanner
		input.close();
	}
}
