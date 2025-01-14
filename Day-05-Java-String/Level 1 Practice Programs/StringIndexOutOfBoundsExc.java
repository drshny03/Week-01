import java.util.Scanner;

public class StringIndexOutOfBoundsExc
{
   public static void generateException(String s) {
           int length = s.length();
           s.charAt(length+1);

        }
    
    
        public static void handleException(String s) {
            
            try {
                int length = s.length();
                s.charAt(length+1);
                
            } catch (StringIndexOutOfBoundsException e) {
       
                System.out.println("Caught StringIndexOutOfBoundsException");
            }
        }
    
        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Any String ");
            String string = input.next();
            
            System.out.println("Calling method to generate the exception:");
            try {
                generateException(string); 
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Caught exception in main: " + e.getMessage());
            }
    
            
            System.out.println("\nCalling method to handle the exception:");
            handleException(string); 
        }
    

}
