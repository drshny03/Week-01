//import random class
import java.util.Random;

class FootballTeamHeight{

    // Method to calculate the sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height; // Add each height to the sum
        }
        return sum;
    }

    // Method to calculate the mean height of players
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights); // Call method to get total sum
        return (double) sum / heights.length; // Calculate mean
    }

    // Method to find the shortest player's height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0]; // Initialize shortest with the first height
        for (int height : heights) {
            if (height < shortest) {
                shortest = height; // Update shortest if a smaller height is found
            }
        }
        return shortest;
    }

    // Method to find the tallest player's height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0]; // Initialize tallest with the first height
        for (int height : heights) {
            if (height > tallest) {
                tallest = height; // Update tallest if a larger height is found
            }
        }
        return tallest;
    }

    public static void main(String[] args){
		
        //array to store player heights
		int size = 11;
        int[] heights = new int[size];
        Random random = new Random();

        //generate random heights
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        // Display player heights
        System.out.println("Player Heights ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
		
		//find mean, shortest and tallest height using method
		int shortestHeight = findShortestHeight(heights);
		int tallestHeight = findTallestHeight(heights);
		double meanHeight = calculateMean(heights);

        // Display results
        System.out.println("Shortest Player Height: " + shortestHeight + "\nTallest Player Height: " + tallestHeight + "\nMean Player Height: " + meanHeight);
    }
}
