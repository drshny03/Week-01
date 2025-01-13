//import scanner class
import java.util.Scanner;

class EuclideanDistance{
    //method to calculate Euclidean distance
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
		 //distance formula
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    //method to calculate slope and y-intercept of the line
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); //calculate slope
        double yIntercept = y1 - slope * x1; //calculate y-intercept 
		
		////return slope and y-intercept as array
		double[] slopeAndYIntercept = new double[]{slope, yIntercept};
        return slopeAndYIntercept;
    }

    //main method
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //inputs first point
        System.out.print("Enter x1 ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1 ");
        double y1 = input.nextDouble();

        //inputs second point
        System.out.print("Enter x2 ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2 ");
        double y2 = input.nextDouble();

        //calculate Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);

        //find line equation
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        //display results
        System.out.println("Euclidean Distance " + distance);
        System.out.println("Equation of Line y = " + slope + "*x + " + yIntercept);

        //close scanner
        input.close();
    }
}
