class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];

        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }

        for(int i=1;i<=n;i++){
            for(int sum = 1;sum <= amount;sum++){
                int nottake = dp[i-1][sum];
                int take = 0;
                if(coins[i-1] <= sum){
                    take = dp[i][sum - coins[i-1]];
                }
                dp[i][sum] = nottake + take;
            }
        }
        return dp[n][amount];
    }
}