public class NullPointerDemo {

   
    public static void generateException() {
        String text = null;
        
        System.out.println(text.length());
    }


    public static void handleException() {
        String text = null;
        try {
          
            System.out.println(text.length());
        } catch (NullPointerException e) {
   
            System.out.println("Caught NullPointerException: Cannot call method on null.");
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Calling method to generate the exception:");
        try {
            generateException(); 
        } catch (NullPointerException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        
        System.out.println("\nCalling method to handle the exception:");
        handleException(); 
    }
}
