import java.util.Set;
import java.util.HashSet;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        for(int num : nums) {
            hs.add(num);
        }
        int ans = k;
        while(hs.contains(ans)) {
            ans += k;
        }
        return ans;
    }
}