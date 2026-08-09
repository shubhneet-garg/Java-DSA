class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task - 'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int f : freq){
            if(f > 0){
                pq.add(f);
            }
        }
        int time = 0;
        while(!pq.isEmpty()){
            int cycle = n+1;
            ArrayList<Integer> temp = new ArrayList<>();
            while(cycle > 0 && !pq.isEmpty()){
                int f = pq.poll();
                f--;
                if(f>0){temp.add(f);}
                time++;
                cycle--;
            }
            for(int f : temp){
                pq.add(f);
            }
            if (!pq.isEmpty()) {
                time += cycle;
            }
        }
        return time;
    }
}