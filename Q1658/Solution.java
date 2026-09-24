import java.util.*;
class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int i : nums) {
            totalSum += i;
        }
        int k = totalSum - x;
        if(k < 0) return -1;
        if(k == 0) return nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int ps = 0;
        int maxLen = -1;
        for(int i = 0;i < nums.length;i++) {
            ps += nums[i];
            if(mp.containsKey(ps - k)) {
                int start = mp.get(ps - k);
                maxLen = Math.max(maxLen,i - start);
            }
            if(!mp.containsKey(ps)) {
                mp.put(ps,i);
            }
        }
        if(maxLen == -1) return -1;
        return nums.length - maxLen;
    }
}