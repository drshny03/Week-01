public class ExtendedUnitConverter {

    // Temperature conversions
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Mass conversions
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Volume conversions
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("100 Fahrenheit = " + convertFahrenheitToCelsius(100) + " Celsius");
        System.out.println("37 Celsius = " + convertCelsiusToFahrenheit(37) + " Fahrenheit");
        System.out.println("150 pounds = " + convertPoundsToKilograms(150) + " kilograms");
        System.out.println("70 kilograms = " + convertKilogramsToPounds(70) + " pounds");
        System.out.println("5 gallons = " + convertGallonsToLiters(5) + " liters");
        System.out.println("20 liters = " + convertLitersToGallons(20) + " gallons");
    }
}
