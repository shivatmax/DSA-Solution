class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // Initialize the maximum profit to 0
        int sellingPrice = 0; // Initialize the selling price to 0

        // Iterate through the array of prices in reverse order
        for(int i = prices.length - 1; i >= 0; i--) {
            // Update sellingPrice to the maximum value between the current sellingPrice and the price on day i
            sellingPrice = Math.max(sellingPrice, prices[i]);
            // Calculate the profit if buying on day i and selling at the current sellingPrice, update maxProfit if it's higher
            maxProfit = Math.max(maxProfit, sellingPrice - prices[i]);
        }
        return maxProfit; // Return the maximum profit found
    }
}
