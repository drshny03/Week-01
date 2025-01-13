import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix with given rows and columns
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] mat1, double[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] mat1, double[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] mat1, double[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;
        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to calculate the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to calculate the determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Main method to test the matrix operations
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrices:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for the matrices:");
        int cols = scanner.nextInt();

        System.out.println("Creating random matrices...");
        double[][] mat1 = createRandomMatrix(rows, cols);
        double[][] mat2 = createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(mat1);

        System.out.println("Matrix 2:");
        displayMatrix(mat2);

        System.out.println("Addition of matrices:");
        displayMatrix(addMatrices(mat1, mat2));

        System.out.println("Subtraction of matrices:");
        displayMatrix(subtractMatrices(mat1, mat2));

        if (rows == cols) {
            System.out.println("Transpose of Matrix 1:");
            displayMatrix(transposeMatrix(mat1));

            if (rows == 2) {
                System.out.println("Determinant of Matrix 1 (2x2): " + determinant2x2(mat1));
            } else if (rows == 3) {
                System.out.println("Determinant of Matrix 1 (3x3): " + determinant3x3(mat1));
            }
        } else {
            System.out.println("Transpose and determinant operations are only available for square matrices.");
        }

        scanner.close();
    }
}
