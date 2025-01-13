//import scanner class
import java.util.Scanner;

class PossibleHandShakesTwo{
	//main method
	public static void main(String[] args){
		
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		// Input number of students
        System.out.print("Enter the number of student");
        int numberOfStudents = input.nextInt();
		
		int numberOfHandshake = (numberOfStudents * (numberOfStudents - 1)) / 2;;
		//Display result 
		System.out.println("total number of handshake is "+ numberOfHandshake);
		
		//close scanner
		input.close();
	}
}