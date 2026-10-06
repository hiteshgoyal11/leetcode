class Solution {
    public int maxProfit(int[] prices) {
        // Early exit: if we can't make a transaction, skip everything
        if (prices.length < 2) {
            return 0;
        }
        
        int maxProfit = 0;
        int minPrice = prices[0];
        
        // Standard for-loop is sometimes JIT-optimized better than the enhanced for-loop
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i]; // Read array value exactly once per iteration
            
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            } else if (currentPrice - minPrice > maxProfit) {
                maxProfit = currentPrice - minPrice;
            }
        }
        
        return maxProfit;
    }
}