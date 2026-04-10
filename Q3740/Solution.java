import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        Map<Integer,List<Integer>> mp = new HashMap<>();
        for(int i = 0;i < n;i++) {
            mp.computeIfAbsent(nums[i],k -> new ArrayList<>()).add(i);
        }
        for(List<Integer> list : mp.values()) {
            if(list.size() >= 3) {
                for(int j = 0;j+2 < list.size();j++) {
                    ans = Math.min(ans,2*(list.get(j+2) - list.get(j)));
                }
            }
        }
        return (ans == Integer.MAX_VALUE)? -1 : ans;
    }
}