class Solution {
    public int maxProfit(int[] prices, int fee) {

        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Better BUY
            buy = Math.min(buy, prices[i] - profit);

            // SELL
            profit = Math.max(
                profit,
                prices[i] - buy - fee
            );
        }

        return profit;
    }
}