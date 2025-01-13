public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("10 kilometers = " + convertKmToMiles(10) + " miles");
        System.out.println("5 miles = " + convertMilesToKm(5) + " kilometers");
        System.out.println("2 meters = " + convertMetersToFeet(2) + " feet");
        System.out.println("6 feet = " + convertFeetToMeters(6) + " meters");
    }
}
