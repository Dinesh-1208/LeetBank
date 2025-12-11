/* 
   Problem: 3531
   Source: LeetCode
   Language: Java
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, List<Integer>> xm = new HashMap<>();
        Map<Integer, List<Integer>> ym = new HashMap<>();
        for (int[] b : buildings) {
            int x = b[0];
            int y = b[1];
            xm.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            ym.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }
        for (List<Integer> list : xm.values()) {
            Collections.sort(list);
        }
        for (List<Integer> list : ym.values()) {
            Collections.sort(list);
        }
        int ans = 0;
        for (int[] b : buildings) {
            int x = b[0];
            int y = b[1];
            List<Integer> row = xm.get(x);
            List<Integer> col = ym.get(y);
            int rowIn = Collections.binarySearch(row, y);
            int colIn = Collections.binarySearch(col, x);
            boolean left = (rowIn > 0);
            boolean right = (rowIn < row.size() - 1);
            boolean up = (colIn > 0);
            boolean down = (colIn < col.size() - 1);
            if (left && right && up && down) {
                ans++;
            }
        }
        return ans;
    }
}