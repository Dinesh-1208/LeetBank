import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x : nums) {
            hs.add(x);
        }
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[nums.length - 1];
        for(int i = min;i <= max;i++) {
            if(!hs.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}