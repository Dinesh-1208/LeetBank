/* 
   Problem: 1590
   Source: LeetCode
   Language: Java
*/

class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int n : nums) {
            total += n;
        }
        int remain = (int) (total % p);
        if (remain == 0) {
            return 0;
        }
        int ans = nums.length;
        long cur_sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            cur_sum = (cur_sum + nums[i]) % p;
            int prefix = (int) (cur_sum - remain + p) % p;
            if (map.containsKey(prefix)) {
                int l = i - map.get(prefix);
                ans = Math.min(ans, l);
            }
            map.put((int) cur_sum, i);
        }
        return ans == nums.length ? -1 : ans;
    }
}