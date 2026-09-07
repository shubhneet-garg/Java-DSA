class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        if (Math.abs(target) > total) {
            return 0;
        }
        if ((total + target) % 2 != 0) {
            return 0;
        }
        int sum = (total + target) / 2;
        int[][] dp = new int[n][sum + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        if (nums[0] <= sum) {
            dp[0][nums[0]] += 1;
        }
        for (int i = 1; i < n; i++) {
            for (int s = 0; s <= sum; s++) {
                int notTake = dp[i - 1][s];
                int take = 0;
                if (nums[i] <= s) {
                    take = dp[i - 1][s - nums[i]];
                }
                dp[i][s] = notTake + take;
            }
        }
        return dp[n - 1][sum];
    }
}