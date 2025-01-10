import java.util.Scanner;

class YoungestAndTallestFriend {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the age and height of 3 friends
        System.out.println("Enter age and height for Amar:");
        int ageAmar = input.nextInt();
        int heightAmar = input.nextInt();

        System.out.println("Enter age and height for Akbar:");
        int ageAkbar = input.nextInt();
        int heightAkbar = input.nextInt();

        System.out.println("Enter age and height for Anthony:");
        int ageAnthony = input.nextInt();
        int heightAnthony = input.nextInt();

        // Find the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (youngestAge == ageAmar) {
            System.out.println("The youngest friend is Amar.");
        } else if (youngestAge == ageAkbar) {
            System.out.println("The youngest friend is Akbar.");
        } else {
            System.out.println("The youngest friend is Anthony.");
        }

        // Find the tallest friend
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (tallestHeight == heightAmar) {
            System.out.println("The tallest friend is Amar.");
        } else if (tallestHeight == heightAkbar) {
            System.out.println("The tallest friend is Akbar.");
        } else {
            System.out.println("The tallest friend is Anthony.");
        }

        // Close the scanner stream
        input.close();
    }
}