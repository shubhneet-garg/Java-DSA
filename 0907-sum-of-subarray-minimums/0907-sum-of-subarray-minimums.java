class Solution {
    public int[] pse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n-1;i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int[] nse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = n;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        long ans = 0;
        int MOD = 1_000_000_007;
        int[] pse = pse(arr);
        int[] nse = nse(arr);

        for(int i=0;i<arr.length;i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            long contribution = (long) arr[i] * left * right;
            ans = (ans + contribution) % MOD;
        }
        return (int)ans;
    }
}