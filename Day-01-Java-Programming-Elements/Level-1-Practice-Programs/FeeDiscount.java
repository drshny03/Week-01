    // Creating a class to calculate the discounted fee for a university course
class FeeDiscount {
    public static void main(String[] args) {
        
        // Create variables for fee and discount percentage
        double fee = 125000;
        double discountPercent = 10;
        
        // Calculate discount amount and discounted fee
        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;
        
        // Display the discount amount and the discounted fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
