// Program to generate and display the multiplication table of a given number.
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number for the multiplication table
        System.out.print("Enter a number for the multiplication table: ");
        int number = input.nextInt();

        // Array to store the results of the multiplication table
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1); // Calculate and store each result
        }

        // Display the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close(); // Close Scanner object
    }
}