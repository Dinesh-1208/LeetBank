import java.util.*;
class Solution {
    public int maximumLength(int[] nums) {
        Map<Long,Integer> freq = new HashMap<>();
        for(int x : nums) {
            freq.put((long)x,freq.getOrDefault((long)x,0) + 1);
        }
        int ans = 1;
        if(freq.containsKey(1L)) {
            int c = freq.get(1L);
            ans = (c % 2 == 0)? c-1: c;
        }
        for(long start : freq.keySet()) {
            if(start == 1) continue;
            long curr = start;
            int len = 0;
            while(freq.getOrDefault(curr,0) >= 2) {
                len += 2;
                if (curr > 1000000000L) break;
                curr = curr * curr;
            }
            if(freq.getOrDefault(curr,0) >= 1) {
                len++;
            } else {
                len--;
            }
            ans = Math.max(len,ans);
        }
        return ans;
    }
}