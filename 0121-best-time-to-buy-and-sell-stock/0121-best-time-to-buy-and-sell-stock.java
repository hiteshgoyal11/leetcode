class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int p = prices[i] - min;
                if (p > max)
                    max = p;
            }
        }

        return max;
    }
}