// Creating a class to calculate pens per student and remaining pens
class DistributePens {
    public static void main(String[] args) {
        
        // Create variables for total pens and total students
        int totalPens = 14, students = 3;
        
        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        
        // Display the pens distributed per student and remaining pens
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
