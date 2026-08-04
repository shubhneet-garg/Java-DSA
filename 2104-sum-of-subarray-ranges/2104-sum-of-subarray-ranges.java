class Solution {
    public int[] pse(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n-1;i++){
            while(!st.isEmpty() && nums[i] < nums[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int[] nse(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = n;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i] <= nums[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int[] pge(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n-1;i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int[] nge(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = n;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public long subArrayRanges(int[] nums) {
        long ans = 0;
        int[] pse = pse(nums);
        int[] nse = nse(nums);
        int[] pge = pge(nums);
        int[] nge = nge(nums);

        for(int i=0;i<nums.length;i++){
            long left1 = i - pse[i];
            long right1 = nse[i] - i;

            long left2 = i - pge[i];
            long right2 = nge[i] - i;

            long contribution1 = (long) nums[i] * left1 * right1;
            long contribution2 = (long) nums[i] * left2 * right2;

            ans = ans + (contribution2 - contribution1);
        }
        return ans;
    }
}