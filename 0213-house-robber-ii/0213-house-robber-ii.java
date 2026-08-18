class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        
        int rob = Math.max(case1(nums), case2(nums));
        return rob;
    }
    public int case1(int[] nums){
        int n = nums.length;
        int prev2 = 0;
        int prev1 = 0;
        for(int i=0;i<=n-2;i++){
            int total = nums[i] + prev2;
            int max = Math.max(prev1, total);

            prev2 = prev1;
            prev1 = max;
        }
        return prev1;
    }
    public int case2(int[] nums){
        int n = nums.length;
        int prev2 = 0;
        int prev1 = 0;
        for(int i=1;i<=n-1;i++){
            int total = nums[i] + prev2;
            int max = Math.max(prev1, total);

            prev2 = prev1;
            prev1 = max;
        }
        return prev1;
    }
}