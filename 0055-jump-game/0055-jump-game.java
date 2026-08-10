class Solution {
    public boolean canJump(int[] nums) {
        int duur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > duur) return false;
            duur = Math.max(duur, i + nums[i]);
            if (duur >= nums.length - 1) return true;
        }
        return true;
    }
}