class Solution {
    public int maxProfit(int[] prices, int fee) {

        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Better buying opportunity
            buy = Math.min(buy, prices[i] - profit);

            // Sell today if it gives better profit
            profit = Math.max(
                profit,
                prices[i] - buy - fee
            );
        }

        return profit;
    }
}