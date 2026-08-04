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
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {return 0;}
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] height = new int[cols];
        int maxArea = 0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == '1'){
                    height[j]++;
                }else{
                    height[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }
        return maxArea;
    }
}