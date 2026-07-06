
import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> {
            if(a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        int maxRight = intervals[0][1];
        int c = 0;
        for(int i = 1;i < n;i++) {
            int right = intervals[i][1];
            if(maxRight >= right) {
                c++;
            } else {
                maxRight = right;
            }
        }
        return n - c;
    }
}