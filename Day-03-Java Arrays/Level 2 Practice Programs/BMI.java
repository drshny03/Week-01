import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create arrays to store weight, height, BMI, and weight status of persons
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Input weight
            while (true) {
                System.out.print("Enter weight (kg) for Person " + (i + 1) + ": ");
                double personWeight = scanner.nextDouble();
                if (personWeight > 0) {
                    weight[i] = personWeight;
                    break;
                } else {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            }

            // Input height
            while (true) {
                System.out.print("Enter height (m) for Person " + (i + 1) + ": ");
                double personHeight = scanner.nextDouble();
                if (personHeight > 0) {
                    height[i] = personHeight;
                    break;
                } else {
                    System.out.println("Height must be positive. Please enter again.");
                }
            }

            // Calculate BMI and store in bmi array
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight status for each person
        System.out.println("\nBMI Calculation Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + weight[i] + " kg, Height: " + height[i] + " m, BMI: " + bmi[i] + ", Status: " + weightStatus[i]);
        }
    }
}