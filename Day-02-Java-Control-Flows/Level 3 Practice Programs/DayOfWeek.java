import java.util.Scanner;

// Class to calculate the day of the week for a given date
class DayOfWeek {
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter the date (month, day, year)
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt();
        System.out.print("Enter day: ");
        int d = input.nextInt();
        System.out.print("Enter year: ");
        int y = input.nextInt();
        
        // Apply the formula to calculate the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        
        // Output the day of the week (0 for Sunday, 1 for Monday, etc.)
        System.out.println("The day of the week is: " + d0);
        
        // Close the scanner object to prevent memory leakage
        input.close();
    }
}