class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int as : asteroids){
            boolean alive = true;

            while(alive && !st.isEmpty() && st.peek() > 0 && as < 0){
                if(st.peek() > -as){
                    alive = false;
                }else if(st.peek() == -as){
                    st.pop();
                    alive = false;
                }else{
                    st.pop();
                }
            }
            if(alive){
                st.push(as);
            }
        }
        int[] ans = new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}