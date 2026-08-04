class Solution {
    public int[] pse(int[] heights){
        int n = heights.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n-1;i++){
            while(!st.isEmpty() && heights[i] < heights[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int[] nse(int[] heights){
        int n = heights.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = n;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int largestRectangleArea(int[] heights) {
        long ans = 0;
        int[] pse = pse(heights);
        int[] nse = nse(heights);

        for(int i=0;i<heights.length;i++){
            long height = heights[i];
            long width = nse[i] - pse[i] - 1;
            ans = Math.max(ans,height * width);
        }
        return (int)ans;
    }
}