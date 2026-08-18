class Solution {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;
        for(int num : nums){
            int total = num + prev2;
            int current = Math.max(prev1, total);

            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}