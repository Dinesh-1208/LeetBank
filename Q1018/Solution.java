
/* 
   Problem: 1018
   Source: LeetCode
   Language: Java
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int total = 0;
        for (int i : nums) {
            total = (total * 2 + i) % 5;
            list.add(total == 0);
        }
        return list;
    }
}