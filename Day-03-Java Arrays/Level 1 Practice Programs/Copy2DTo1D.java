
import java.util.Scanner;

// Program to copy a 2D array into a 1D array.
class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input rows and columns for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Create and input elements for the 2D array
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Create 1D array to store elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.print("1D Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        input.close(); // Close Scanner object
    }
}

