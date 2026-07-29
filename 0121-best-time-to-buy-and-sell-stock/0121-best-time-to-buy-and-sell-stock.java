class Solution {
    public int maxProfit(int[] prices) {
        int minp = Integer.MAX_VALUE;
        int maxp = 0;
        for(int i=0;i<prices.length;i++){
            minp = Math.min(prices[i], minp);
            maxp = Math.max(prices[i]-minp, maxp);
        }
        return maxp;
    }
}