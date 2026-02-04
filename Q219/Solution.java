import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                ans.remove(nums[i - k - 1]);
            }
            if (ans.contains(nums[i])) {
                return true;
            }
            ans.add(nums[i]);
        }
        return false;
    }
}
