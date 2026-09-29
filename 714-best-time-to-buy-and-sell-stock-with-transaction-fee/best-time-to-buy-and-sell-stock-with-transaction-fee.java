class Solution {
    public int maxProfit(int[] prices, int fee) {

        int n = prices.length;

        int[] dp = new int[n];

        int buy = prices[0];

        for (int i = 1; i < n; i++) {

            // Sell the stock bought at 'buy'
            dp[i] = Math.max(
                dp[i - 1],
                prices[i] - buy - fee
            );

            // Adjust the effective buying price using
            // the profit already obtained.
            buy = Math.min(
                buy,
                prices[i] - dp[i - 1]
            );
        }

        return dp[n - 1];
    }
}