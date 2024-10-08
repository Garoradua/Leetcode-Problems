class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int max_profit = 0;

        for(int i=1; i<prices.length; i++){
            minimum= Math.min(minimum, prices[i]);
            max_profit = Math.max(prices[i]-minimum, max_profit);
        }
        return max_profit;
    }
}