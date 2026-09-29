class Solution {
    public int maxProfit(int[] prices, int fee) {

        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Find a cheaper buying price
            if (prices[i] < buy) {
                buy = prices[i];
            }

            // Sell when the current price gives profit
            else if (prices[i] - buy > fee) {

                profit += prices[i] - buy - fee;

                // Start looking for the next transaction
                buy = prices[i] - fee;
            }
        }

        return profit;
    }
}