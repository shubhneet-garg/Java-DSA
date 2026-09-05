class Solution {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;
        for(int num : nums){
            int take = num + prev2;
            int nottake = prev1;

            int curr = Math.max(take, nottake);

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}