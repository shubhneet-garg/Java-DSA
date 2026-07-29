class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int unit = 0;

        for(int[] box : boxTypes){
            int take = Math.min(box[0], truckSize);
            unit += take*box[1];
            truckSize -= take;

            if(truckSize == 0) break;
        }
        return unit;
    }
}