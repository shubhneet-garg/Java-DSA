class Solution {
    int[][] dp;
    public int solve(int[] cuts, int l, int r){
        if(r-l < 2){
            return 0;
        }
        if(dp[l][r] != -1){
            return dp[l][r];
        }

        int ans = Integer.MAX_VALUE;

        for(int i=l+1;i<r;i++){
            int cost = (cuts[r] - cuts[l]) + solve(cuts, l, i) + solve(cuts, i, r);
            ans = Math.min(ans, cost);
        }
        return dp[l][r] = ans;
    }
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] arr = new int[m+2];
        arr[0] = 0;
        for(int i=0;i<m;i++){
            arr[i+1] = cuts[i];
        }
        arr[m+1] = n;

        Arrays.sort(arr);
        dp = new int[m+2][m+2];

        for(int i=0;i<m+2;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(arr, 0, m+1);
    }
}