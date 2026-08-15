class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.add(start);
        visited[start] = true;
        
        while(!q.isEmpty()){
            int i = q.poll();

            if(arr[i] == 0){
                return true;
            }

            int backward = i - arr[i];
            int forward = i + arr[i];

            if(backward >= 0 && !visited[backward]){
                visited[backward] = true;
                q.add(backward);
            }

            if(forward < n && !visited[forward]){
                visited[forward] = true;
                q.add(forward);
            }
        }
        return false;
    }
}