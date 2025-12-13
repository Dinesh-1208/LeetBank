/* 
   Problem: 3623
   Source: LeetCode
   Language: Java
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int countTrapezoids(int[][] points) {
        long MOD = 1_000_000_007;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int[] point : points) {
            int y = point[1];
            mp.put(y, mp.getOrDefault(y, 0) + 1);
        }
        List<Long> segment = new ArrayList<>();
        for (int count : mp.values()) {
            if (count >= 2) {
                long pairs = (long) count * (count - 1) / 2;
                segment.add(pairs);
            }
        }
        if (segment.size() < 2)
            return 0;
        long total = 0;
        for (long i : segment) {
            total += i;
        }
        long ans = 0;
        for (long s : segment) {
            total -= s;
            ans += s * total;
        }
        return (int) (ans % MOD);
    }
}