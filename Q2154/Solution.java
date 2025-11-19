/* 
   Problem: 2154
   Source: LeetCode
   Language: Java
*/

package Q2154;

import java.util.HashSet;

class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        while (set.contains(original)) {
            original *= 2;
        }
        return original;
    }
}
