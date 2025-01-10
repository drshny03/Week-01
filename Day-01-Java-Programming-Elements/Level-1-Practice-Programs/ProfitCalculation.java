// Creating a class to calculate profit and profit percentage
class ProfitCalculation {
    public static void main(String[] args) {
        
        // Create variables for cost price and selling price
        double costPrice = 129, sellingPrice = 191;
        
        // Calculate profit and profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        
        // Display the cost price, selling price, profit, and profit percentage
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}
