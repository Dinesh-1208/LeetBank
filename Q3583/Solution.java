/* 
   Problem: 3583
   Source: LeetCode
   Language: Java
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        long count = 0;
        final int MOD = 1_000_000_007;
        Map<Integer, Integer> after = new HashMap<>();
        Map<Integer, Integer> prev = new HashMap<>();
        for (int i : nums) {
            after.put(i, after.getOrDefault(i, 0) + 1);
        }
        for (int j = 0; j < n; j++) {
            int val = nums[j];
            after.put(val, after.get(val) - 1);
            if (after.get(val) == 0)
                after.remove(val);
            int left = prev.getOrDefault(2 * val, 0);
            int right = after.getOrDefault(2 * val, 0);
            count = (count + (long) left * right) % MOD;
            prev.put(val, prev.getOrDefault(val, 0) + 1);
        }
        return (int) count;
    }
}