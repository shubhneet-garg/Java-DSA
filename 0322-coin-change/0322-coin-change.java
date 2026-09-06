class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount + 1];

        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }
        for(int j=1;j<=amount;j++){
            dp[0][j] = 1000000;
        }

        for(int i=1;i<=n;i++){
            for(int sum=1; sum<=amount; sum++){
                dp[i][sum] = dp[i-1][sum];
                if(coins[i-1] <= sum){
                    dp[i][sum] = Math.min(dp[i][sum] , 1 + dp[i][sum-coins[i-1]]);
                }
            }
        }
        return dp[n][amount] >= 1000000  ? -1 : dp[n][amount];
    }
}