// Creating a class to convert Fahrenheit to Celsius
import java.util.Scanner;

class TemperatureConversionFahrenheitToCelsius {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5/9;
        
        // Display the result
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}
