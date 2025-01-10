import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get user input for weight (in kg) and height (in cm)
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);

        // Output the BMI value
        System.out.println("\nYour BMI is: " + bmi);

        // Determine the weight status based on the BMI value
        String weightStatus;

        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            weightStatus = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        // Output the weight status
        System.out.println("Your weight status is: " + weightStatus);

        // Close the scanner stream
        input.close();
    }
}

