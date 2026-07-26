class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;
        int j = 0;
        for(int i=0;i<n;i++){
            j = start + 2*i;
            xor ^= j;
        }
        return xor;
    }
}