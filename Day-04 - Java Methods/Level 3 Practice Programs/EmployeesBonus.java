//import random class
import java.util.Random;

class EmployeesBonus {
    //method to generate random salaries and years of service
    public static int[][] generateEmployeeData(int numberOfEmployees){

        //create object of random class
        Random random = new Random();
        //2D array to store salary and service year
        int[][] employeeData = new int[numberOfEmployees][2];

        for (int i = 0; i < numberOfEmployees; i++){
            //generate random salary and year of service
            employeeData[i][0] = 30000 + random.nextInt(70000);
            employeeData[i][1] = 1 + random.nextInt(15); 
        }

        //return data of employees
        return employeeData;
    }

    //method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData){

        // array to store update salary
        double[][] updatedData = new double[employeeData.length][3];

        //calculate new salary
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02; 
            double bonus = oldSalary * bonusPercentage; 
            double newSalary = oldSalary + bonus; 

            updatedData[i][0] = bonus;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }

        //return updated data
        return updatedData;
    }

    //method to calculate total and employee data
    public static void displayResults(int[][] employeeData, double[][] updatedData){

        //variable to store total salary and bonus
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");


        for (int i = 0; i < employeeData.length; i++){
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15d %-15d %-15.2f %-15.2f%n", (i + 1), oldSalary, yearsOfService, bonus, newSalary);
        }

        System.out.printf("%-25s %-15.2f %-15.2f %-15.2f%n", "TOTAL", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate employee data
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate bonus and new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Display results
        displayResults(employeeData, updatedData);
    }
}
