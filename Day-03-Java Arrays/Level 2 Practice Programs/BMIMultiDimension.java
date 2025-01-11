import java.util.Scanner;

public class BMIMultiDimension{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3]; // personData[i][0] -> weight, personData[i][1] -> height, personData[i][2] -> BMI
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Input weight
            while (true) {
                System.out.print("Enter weight (kg) for Person " + (i + 1) + ": ");
                double personWeight = scanner.nextDouble();
                if (personWeight > 0) {
                    personData[i][0] = personWeight;  // Storing weight
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
                    personData[i][1] = personHeight;  // Storing height
                    break;
                } else {
                    System.out.println("Height must be positive. Please enter again.");
                }
            }

            // Calculate BMI and store in personData array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]); // BMI = weight / (height * height)

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight status for each person
        System.out.println("\nBMI Calculation Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + personData[i][0] + " kg, Height: " + personData[i][1] + " m, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}