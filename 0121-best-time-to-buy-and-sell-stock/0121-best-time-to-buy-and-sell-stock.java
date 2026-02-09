class Solution {
    public int maxProfit(int[] prices) {

        int Lowest = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < Lowest) {
                Lowest = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - Lowest);
            }
        }

        return profit;
    }
}
