// Creating a class to convert Celsius to Fahrenheit
import java.util.Scanner;

class TemperatureConversionCelsiusToFahrenheit {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
