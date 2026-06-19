class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int travel = 0;
        for(int i = 0;i<gain.length;i++) {
            travel += gain[i];
            max = Math.max(max,travel);
        }
        return max;
    }
}