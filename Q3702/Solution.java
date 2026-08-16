class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int ans = 0;
        boolean zeros = true;
        for(int num : nums) {
            ans ^= num;
            if(num > 0) {
                zeros = false;
            }
        }
        if(ans > 0) {
            return n;
        }
        return zeros ? 0 : n-1;
    }
}