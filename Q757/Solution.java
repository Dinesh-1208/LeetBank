
/* 
   Problem: 757
   Source: LeetCode
   Language: Java
*/

package Q757;

class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        int n = intervals.length;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(intervals, (a,b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });
        for(int i = 0; i < n; i++) {
            int s = intervals[i][0];
            int l = intervals[i][1];
            int count = 0;
            int closest = -1;
            for(int x : set) {
                if(x >= s && x <= l) {
                    if(count == 0) closest = x;
                    count++;
                    if(count == 2) break;
                }
            }
            if(count == 0) {
                set.add(l - 1);
                set.add(l);
            } else if(count == 1) {
                if(closest != l) set.add(l);
                else set.add(l - 1);
            }
        }
        return set.size();
    }
}
