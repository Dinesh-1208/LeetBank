import java.util.HashSet;
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        HashSet<Integer> pair = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pair.add(nums[i] ^ nums[j]);
            }
        }
        HashSet<Integer> ans = new HashSet<>();
        for (int x : pair) {
            for (int k = 0; k < n; k++) {
                ans.add(x ^ nums[k]);
            }
        }
        return ans.size();
    }
}